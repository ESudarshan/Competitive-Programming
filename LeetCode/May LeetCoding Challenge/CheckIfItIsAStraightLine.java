class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        boolean isStraightLine = true;
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        int x1Diff = Math.abs(x0 - x1);
        int y1Diff = Math.abs(y0 - y1);
        for(int i=2; i<coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];
            int xiDiff = Math.abs(x0 - xi);
            int yiDiff = Math.abs(y0 - yi);
            if(x1Diff * yiDiff != xiDiff * y1Diff) {
                isStraightLine = false;
                break;
            }
        }
        return isStraightLine;
    }
}