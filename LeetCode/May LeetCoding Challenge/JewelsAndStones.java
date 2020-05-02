class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0; 
        HashSet<Character> jewels = new HashSet<>();
        for(int i=0; i<J.length(); i++) {
            jewels.add(J.charAt(i));
        }
        for(int i=0; i<S.length(); i++) {
            if(jewels.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }
   
}	