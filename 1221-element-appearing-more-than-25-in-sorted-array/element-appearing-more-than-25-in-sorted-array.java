class Solution {
    public int findSpecialInteger(int[] arr) {
        int t = arr.length / 4;
        for (int i = 0; i < arr.length - t; i++) {
            if (arr[i] == arr[i + t]) {
                return arr[i];
            }
        } 
        return -1;
    }
}
