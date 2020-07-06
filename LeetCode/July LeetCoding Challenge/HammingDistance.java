class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int dist = 0;
        do {
            int lsb = xor & 1;
            if(lsb == 1) {
                dist++;
            }
            xor = xor >> 1;
        } while(xor != 0);
        return dist;
    }
}