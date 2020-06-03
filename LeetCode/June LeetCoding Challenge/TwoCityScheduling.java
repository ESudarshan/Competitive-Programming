class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int len = costs.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (costs[b][1] - costs[b][0]) - (costs[a][1] - costs[a][0]));
        for(int i=0; i<len; i++) {
            pq.add(i);
        }
        int minCost = 0;
        for(int i=1; i<=len; i++) {
            int k = pq.remove();
            minCost = minCost + (i <= len/2 ? costs[k][0] : costs[k][1]);
        }
        return minCost;
    }
}