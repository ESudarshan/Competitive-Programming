static int hourglassSum(int[][] arr) {
    int maxSum = -63;
    for(int i=0; i<arr.length; i++) {
        if((i+2) < arr.length) {
            for(int j=0; j<arr[i].length; j++) {
                if((j+2) < arr[i].length) {
                   maxSum = Math.max(maxSum, calculateHourGlassSum(arr, i, j));  
                }  
            }    
        }
    }
    return maxSum;
}

static int calculateHourGlassSum(int[][] arr, int iStart, int jStart) {
    int sum = 0;
    for(int i = iStart; i < iStart+3; i++) {
        for(int j = jStart; j < jStart+3; j++) {
            if(i == iStart+1 && (j == jStart || j == jStart+2)) {
                continue;
            }
            sum = sum + arr[i][j];
        }    
    }
    return sum;
}