public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 1; i<=32; i++) {
            int lsb = n & 1;
            n = n >> 1;
            res = res | lsb;
            if(i != 32) {
                res = res << 1;
            }
        }
        return res;
    }
}