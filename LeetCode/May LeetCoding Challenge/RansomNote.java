class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean canConstruct = true;
        HashMap<Character, Integer> magCharMap = new HashMap<>();
        for(Character magChar : magazine.toCharArray()) {
            magCharMap.put(magChar, magCharMap.getOrDefault(magChar, 0) + 1);
        }
        for(Character ransomChar : ransomNote.toCharArray()) {
            if(magCharMap.containsKey(ransomChar)) {
                int count = magCharMap.get(ransomChar);
                if(count == 1) {
                    magCharMap.remove(ransomChar);
                }else {
                     magCharMap.put(ransomChar, count-1);
                }
            }else{
                canConstruct = false;
            }
        }
        return canConstruct;
    }
}