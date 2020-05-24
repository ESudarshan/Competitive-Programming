class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int alen = A.length;
        int blen = B.length;
        List<int[]> res = new ArrayList<>();
        int ai = 0;
        int bi = 0;
        int start = -1;
        int end = -1;
        while(ai<alen && bi<blen) {
            start = Math.max(A[ai][0], B[bi][0]);
            end = Math.min(A[ai][1], B[bi][1]);;
            if(start <= end) {
                res.add(new int[] {start, end});
            }
            if(A[ai][1] < B[bi][1]) {
                ai++;
            } else if(A[ai][1] > B[bi][1]) {
                bi++;
            } else {
                ai++;
                bi++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}