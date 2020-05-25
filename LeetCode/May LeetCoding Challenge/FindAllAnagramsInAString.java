class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s == null || s.length() == 0 || s.length() < p.length()) {
            return result;
        }
        int pFreq[] = new int[26];
        for(char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }
        int sFreq[] = new int[26];
        int left = 0;
        int right = 0;
        int pLen = p.length();
        int sLen = s.length();
        while(right < pLen) {
            sFreq[s.charAt(right) - 'a']++;
            right++;
        }
        right--;
        while(right < sLen) {
            if(Arrays.equals(pFreq, sFreq)) {
                result.add(left);
            }
            sFreq[s.charAt(left) - 'a']--;
            left++;
            right++;
            if(right < sLen) {
                sFreq[s.charAt(right) - 'a']++;
            }
        }
        return result;
    }
}