class Solution {
   
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) {
            return image;
        }
        floodFill(sr, sc, image[sr][sc], newColor, image);
        return image;
        
    }

    private void floodFill(int r, int c, int oc, int nc, int[][] image) {
        if(r < 0 || r >= image.length || c < 0 || c >= image[r].length) {
            return;
        }
        if(image[r][c] != oc) {
            return;
        }
        image[r][c] = nc;
        floodFill(r-1, c, oc, nc, image);
        floodFill(r, c-1, oc, nc, image);
        floodFill(r, c+1, oc, nc, image);
        floodFill(r+1, c, oc, nc, image);        
    }
}