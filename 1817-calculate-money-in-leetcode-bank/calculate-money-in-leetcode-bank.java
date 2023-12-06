class Solution {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int days = n / 7;
        int remainingDays = n % 7;
        for (int i = 0; i < days; i++) {
            int mondayValue = i + 1;
            int sundayValue = mondayValue + 6;
            int weekSum = (mondayValue + sundayValue) * 7 / 2;
            totalMoney += weekSum;
        }
        int mondayValue = days + 1; 
        for (int i = 0; i < remainingDays; i++) {
            totalMoney += mondayValue + i;
        }
        return totalMoney;
    }
}
