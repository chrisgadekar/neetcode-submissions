class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: If lengths differ → not anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert to char arrays
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare characters
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}