class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        return isHappy(n, set);
    }
    
    private boolean isHappy(int n, Set set) {
        System.out.println(n+" : "+set);
        int sum = 0;
        while(n != 0) {
            int d = n % 10;
            sum += d * d;
            n = n / 10;
        }
        if(sum == 1) {
            return true;
        }
        if(set.contains(sum)) {
            return false;
        } 
        set.add(sum);
        return isHappy(sum, set);
    }
}