class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int n = A.length;
        if(n == 1) {
            return A[0];
        }
        int currMaxSum = A[0];
        int maxSum = A[0];
        int currMinSum = A[0];
        int minSum = A[0];
        int totalSum = A[0];
        for(int i = 1; i < n ; i++) {
            currMaxSum = Math.max(currMaxSum + A[i], A[i]);
            maxSum = Math.max(maxSum, currMaxSum);

            currMinSum = Math.min(currMinSum + A[i], A[i]);
            minSum = Math.min(minSum, currMinSum);

            totalSum += A[i];
        }
        return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum-minSum);
    }
}