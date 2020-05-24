class StockSpanner {
    
    Stack<Integer> stack;
    List<Integer> list;

    public StockSpanner() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        int span = -1;
        while(!stack.isEmpty() && list.get(stack.peek()) <= price) {
            stack.pop();
        }
        if(stack.isEmpty()) {
            span = list.size() + 1;
        } else {
            span = list.size() - stack.peek();
        }
        stack.push(list.size());
        list.add(price);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */