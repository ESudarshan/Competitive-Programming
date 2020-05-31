class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Map<int[], Double> map = new HashMap<>();
        for(int[] p : points) {
            map.put(p, Math.sqrt(Math.pow(p[0], 2) + Math.pow(p[1], 2)));
        }
        PriorityQueue<int[]> pq = new PriorityQueue((a, b) -> {
            if(map.get(a) < map.get(b)){
                return 1;
            } else if(map.get(a) > map.get(b)){
                return -1;
            } else {
                return 0;
            }
            });
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