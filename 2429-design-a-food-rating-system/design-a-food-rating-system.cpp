class FoodRatings {
    map<string, pair<string, int>> f;
    map<string, map<int, set<string>>> c;

public:
    FoodRatings(vector<string>& foods, vector<string>& cuisines, vector<int>& ratings) {
        for (int i = 0; i < foods.size(); i++) {
            f[foods[i]] = {cuisines[i], ratings[i]};
            c[cuisines[i]][ratings[i]].insert(foods[i]);
        }
    }

    void changeRating(string food, int newRating) {
        auto foodInfo = f.find(food);
        string cuisine = foodInfo->second.first;
        int oldRating = foodInfo->second.second;
        foodInfo->second.second = newRating;

        c[cuisine][oldRating].erase(food);
        if (c[cuisine][oldRating].empty())
            c[cuisine].erase(oldRating);

        c[cuisine][newRating].insert(food);
    }

    string highestRated(string cuisine) {
        return *c[cuisine].rbegin()->second.begin();
    }
};