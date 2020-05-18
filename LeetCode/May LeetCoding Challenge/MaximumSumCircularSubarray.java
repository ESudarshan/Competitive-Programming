class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int n = A.length;
        if(n == 1) {
            return A[0];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int sum = A[i];
            int j = (i+1)%n;
            int counter = 1;
            while(counter < n){
                sum = Math.max(sum + A[j], A[j]);
                maxSum = Math.max(maxSum, sum);
                j = (j+1)%n;
                counter++;
            }
        }
        return maxSum;
    }
}
