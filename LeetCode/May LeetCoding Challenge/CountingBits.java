class Solution {
    public int[] countBits(int num) {
        int res[]= new int[num+1];
        for(int i=0; i<=num; i++) {
            int n = i;
            int count = 0;
            while(n != 0) {
                if(n % 2 != 0) {
                    count++;
                }
                n = n>>1;
            }
            res[i] = count;
        }
        return res;
    }
}