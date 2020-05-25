class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0 || s1.length() > s2.length()) {
            return false;
        }
        int s1Freq[] = new int[26];
        for(char ch : s1.toCharArray()) {
            s1Freq[ch - 'a']++;
        }
        int s2Freq[] = new int[26];
        int left = 0;
        int right = 0;
        int s1Len = s1.length();
        int s2Len = s2.length();
        while(right < s1Len) {
            s2Freq[s2.charAt(right) - 'a']++;
            right++;
        }
        right--;
        while(right < s2Len) {
            if(Arrays.equals(s1Freq, s2Freq)) {
                return true;
            }
            s2Freq[s2.charAt(left) - 'a']--;
            left++;
            right++;
            if(right < s2Len) {
                s2Freq[s2.charAt(right) - 'a']++;
            }
        }
        return false;
    }
}