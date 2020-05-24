class StockSpanner {
    
    List<Integer> list;

    public StockSpanner() {
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        int span = 0;
        list.add(price);
        for(int i=list.size()-1; i>=0; i--) {
            int cp = list.get(i);
            if(cp <= price) {
                span++;
            } else {
                break;
            }
        }
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */