class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int alen = A.length;
        int blen = B.length;
        int C[][] = new int[alen+blen][2];
        int ai = 0;
        int bi = 0;
        int ci = 0;
        int start = -1;
        int end = -1;

        while(ai<alen && bi<blen) {
            start = -1;
            end = -1;
            if(A[ai][0] < B[bi][0]) {
                start = B[bi][0];
                if(A[ai][1] >= B[bi][0]) {
                    if(A[ai][1] < B[bi][1]) {
                        end = A[ai][1];
                        ai++;
                    } else if(A[ai][1] > B[bi][1]) {
                        end = B[bi][1];
                        bi++;
                    } else {
                        end = A[ai][1];
                        ai++;
                        bi++;
                    } 
                } else {
                    ai++;
                }
            } else if(A[ai][0] > B[bi][0]) {
                start = A[ai][0];
                if(B[bi][1] >= A[ai][0]) {
                   if(A[ai][1] < B[bi][1]) {
                        end = A[ai][1];
                        ai++;
                    } else if(A[ai][1] > B[bi][1]) {
                        end = B[bi][1];
                        bi++;
                    } else {
                        end = A[ai][1];
                        ai++;
                        bi++;
                    }    
                } else { 
                    bi++;
                }
            } else {
                start = A[ai][0];
                if(A[ai][1] < B[bi][1]) {
                    end = A[ai][1];
                    ai++;
                } else if(A[ai][1] > B[bi][1]) {
                    end = B[bi][1];
                    bi++;
                } else {
                    end = A[ai][1];
                    ai++;
                    bi++;
                }   
            }
            if(start != -1 && end != -1) {
                C[ci][0] = start;
                C[ci][1] = end;
                ci++;
            }
        }
        int[][] res = Arrays.copyOf(C, ci); 
        return res;
    }
}