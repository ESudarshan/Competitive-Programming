class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }   
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(char ch : map.keySet()) {
            pq.add(new Pair(ch, map.get(ch)));
        }
        StringBuilder sb = new StringBuilder();
        int n = pq.size();
        for(int i=0; i<n; i++) {
            Pair p = pq.remove();
            while(p.cnt != 0) {
                sb.append(p.ch);
                p.cnt--;
            }
        }
        return sb.toString();
    }
}

class Pair implements Comparable<Pair> {
    char ch;
    int cnt;
    
    Pair(char ch, int cnt) {
        this.ch = ch;
        this.cnt = cnt;
    }
    
    public int compareTo(Pair that) {
        if(this.cnt < that.cnt) {
            return 1;
        } else if(this.cnt > that.cnt) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public String toString() {
       return ch +"="+cnt;
    }
    
}