class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int s1n = s1.length();
        int s2n = s2.length();
        for(int i=0; i<=s2n-s1n; i++) {
            int j = i;
            int k = i+s1n;
            HashMap<Character, Integer> temp = new HashMap<>();
            temp.putAll(map);
            while(j < k) {  
                char ch = s2.charAt(j);
                if(temp.containsKey(ch)) {
                    int count = temp.get(ch);
                    if(count == 0) {
                        break;
                    }
                    temp.put(ch, count-1);
                } else {
                   break;
                }
                j++;
            }
            if(j == k) {
                return true;
            }
        }
        return false;
    }
}