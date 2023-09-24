class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int count : map.values()) {
            if (countMap.containsKey(count)) {
                return false;
            } else {
                countMap.put(count, 1);
            }
        }
        
        return true;
    }
}
