class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length < N-1) {
           return -1;
        }
        int incoming[] = new int[N+1];
        int outgoing[] = new int[N+1];
        for(int rel[] : trust) {
            outgoing[rel[0]]++;
            incoming[rel[1]]++;
        }
        
        for(int i=1; i<N+1; i++){
            if(outgoing[i] == 0 && incoming[i] == N-1) {
                return i;
            }
        }
        return -1;
    }
}