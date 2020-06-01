class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Map<int[], Integer> map = new HashMap<>();
        for(int[] p : points) {
            map.put(p, p[0] * p[0] + p[1] * p[1]);
        }
        PriorityQueue<int[]> pq = new PriorityQueue((a, b) -> map.get(a) < map.get(b) ? 1 : map.get(a) > map.get(b) ? -1 : 0);
        for(int[] p : points) {
            if(pq.size() == K) {
                if(map.get(p) < map.get(pq.peek())) {
                    pq.remove();
                    pq.add(p);
                }
            } else {
                pq.add(p);
            }
        }
        return pq.toArray(new int[pq.size()][]);
    }
}