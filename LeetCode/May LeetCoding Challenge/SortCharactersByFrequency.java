class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }   
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(a) > map.get(b) ? -1 : map.get(a) == map.get(b) ? 0 : 1);
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        int n = pq.size();
        for(int i=0; i<n; i++) {
            Character ch = pq.remove();
            Integer cnt = map.get(ch);
            while(cnt != 0) {
                sb.append(ch);
                cnt--;
            }
        }
        return sb.toString();
    }
}