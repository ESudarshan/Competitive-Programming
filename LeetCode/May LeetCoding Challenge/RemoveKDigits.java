class Solution {
    public String removeKdigits(String num, int k) {
        char[] array = num.toCharArray();
        int n = array.length;
        if(n == k) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < n) {
            while(!stack.isEmpty() && k != 0 && stack.peek() > array[i]) {
                stack.pop();
                 k--;
            }
            if(!stack.isEmpty() || (stack.isEmpty() && array[i] != '0')) {
                stack.push(array[i]);
            }
            i++;
        }
        StringBuilder res = new StringBuilder();
        if(stack.isEmpty()) {
            return "0";
        }
        if(k != 0) {
            while(k != 0) {
                stack.pop();
                k--;
            }         
        }
        while(!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }
        return res.toString();
    }
}