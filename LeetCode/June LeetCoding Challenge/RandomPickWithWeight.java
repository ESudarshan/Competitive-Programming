class Solution {
    
    private int[] W;
    int len;

    public Solution(int[] w) {
        len = w.length;
        W = new int[len];
        W[0] = w[0];
        for(int i=1; i<len; i++) {
            W[i] = w[i] + W[i-1];
        }
    }
    
    public int pickIndex() {
        int rand = (int)(Math.random() * W[len-1]) + 1;   
        return getBucketIndex(rand);
    }
    
    private int getBucketIndex(int num) {
        int start;
        int end;
        for(int i=0; i<len; i++) {
            if(i == 0) {
                start = 0;
            } else {
                start = W[i-1] + 1;
            }
            end = W[i];
            if(start <= num && num <= end) {
                return i;
            }            
        }
        return -1;
    }
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
 */