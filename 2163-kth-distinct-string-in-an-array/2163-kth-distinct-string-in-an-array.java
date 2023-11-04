import java.util.HashMap;
import java.util.Map;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        
        int distinctCount = 0;
        for (String str : arr) {
            if (frequencyMap.get(str) == 1) {
                distinctCount++;
                
                if (distinctCount == k) {
                    return str;
                }
            }
        }
        
        return "";
    }
}
