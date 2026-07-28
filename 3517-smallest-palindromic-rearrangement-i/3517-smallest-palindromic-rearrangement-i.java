class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];

        // Count frequency of first half
        for (int i = 0; i < n / 2; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        char[] ans = s.toCharArray();
        int left = 0;
        int right = n - 1;

        // Place characters in sorted order
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                ans[left] = (char) ('a' + i);
                ans[right] = (char) ('a' + i);
                left++;
                right--;
                freq[i]--;
            }
        }

        return new String(ans);
    }
}