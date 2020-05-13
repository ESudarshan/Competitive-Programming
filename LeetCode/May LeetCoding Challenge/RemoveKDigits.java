class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        int need = len - k;
        if(need <= 0) {
            return "0";
        }
        String res = "";
        for(int i=0; i<len; i++) {
            int minDigIndex = findMinDigitIndex(num, i, len-1, need);
            res += num.charAt(minDigIndex);   
            need -= 1;
            if(need == 0) {
                break;
            }
            if(minDigIndex + need == len - 1) {
                res += num.substring(minDigIndex + 1);
                break;
            }
        }
        int i =0;
       System.out.println(res +" "+i);
        while(i <=len-1 && res.charAt(i) == '0') {
            i++;
       System.out.println(res +" "+i);
            
        }
        
       // System.out.println(res +" "+i);
        return i<=len-1?res.substring(i):"";
    }
    
    private int findMinDigitIndex(String num, int start, int end, int need) {
        int minDigitIndex = -1;
        Queue<Pair> pq = new PriorityQueue<>(); 
        for(int i=start; i<=end; i++) {
            pq.add(new Pair(i, Character.getNumericValue(num.charAt(i))));
        }
        Pair pair = pq.remove();
        while(pair.index + need > end + 1) {
            pair = pq.remove();
        }
        return pair.index;
    }
    
    class Pair implements Comparable<Pair> {
        public int index;
        public int value;
        
        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
        
        public int compareTo(Pair that) {
            if(this.value < that.value) {
                return -1;
            } else if(this.value > that.value) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}