class Solution {
    public int[] countBits(int num) {
        int res[]= new int[num+1];
        res[0] = 0;
        int p = 0;
        int i=1;
        while(i <= num) {
            int start = (int)Math.pow(2, p);
            int end = (int)Math.pow(2, p + 1);
            int diff = (end - start) / 2;
            while(i <= num && i < end) {    
                if(i < start + diff) {
                    res[i] = res[i - diff];
                } else {
                    res[i] = res[i - diff] + 1;
                }
                i++;
            }
            p++;
        }
        return res;
    }
}