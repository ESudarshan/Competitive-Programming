class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        int  i = 0;
        int num = n;
        while(n != 0) {
            n = n >> 1;
            i++;
        }
        return num == (1 << i-1);
    }
}