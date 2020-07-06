class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int n = cells.length;
        if(N == 0 || n == 0) {
            return cells; 
        }
        while(N > 0) {
            int[] temp = Arrays.copyOf(cells, n);
            cells[0] = 0;
            for(int i = 1; i < n-1; i++) {
                if(temp[i-1] == temp[i+1]) {
                    cells[i] = 1;
                } else {
                    cells[i] = 0;
                }
            }
            cells[n-1] = 0;
            N--;
            System.out.println(Arrays.toString(cells));
        }
        return cells;
    }
}