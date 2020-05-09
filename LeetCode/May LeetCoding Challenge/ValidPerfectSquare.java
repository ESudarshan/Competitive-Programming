class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while(left <= right) {
            long mid = left - ( left - right) / 2;
            long midSquare = mid * mid;
            if(midSquare == num) {
                return true;
            } else if(midSquare < num) {
                left = mid + 1;
            } else if(num < midSquare) {
                right = mid - 1;
            }
        }
        return false;
    }
}