class Solution {
    public int arrangeCoins(int n) {
        long sum = 0;
        int i = 0;
        do {
            i++;
            sum += i;
        } while(sum < n);
        return sum == n ? i : i-1;
    }
}