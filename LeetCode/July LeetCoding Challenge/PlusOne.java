class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        List<Integer> list = new LinkedList<>(); 
        int hand = 1;
        for(int i = n-1; i >= 0; i--) {
            int d = hand + digits[i];
            list.add(d % 10);
            hand = d / 10;
        }
        if(hand != 0) {
            list.add(hand);
        }
        int size = list.size();
        int[] res = new int[size];
        for(int i = 0; i < size; i++) {
            res[i] = list.get(size-1-i);
        }
        return res;
    }
}