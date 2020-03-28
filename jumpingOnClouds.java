static int jumpingOnClouds(int[] c) {
        return jumpingOnClouds(c, 0, c.length-1);
}

static int jumpingOnClouds(int []c, int start, int end) {
    if(start == end) {
        return 0;
    }
    if(c[end] == 0 && (end-start == 1 || end-start == 2)) {
        return 1;
    }
    int minJumps = 0;
    if(c[start+2] == 0) {
        minJumps = 1 + jumpingOnClouds(c, start+2, end);
    }else{
        minJumps = 1 + jumpingOnClouds(c, start+1, end);
    }
    return minJumps;
}


static int jumpingOnClouds(int[] c) {
    int minJumps = -1;
    int i = 0; 
    while(i < c.length) {
        if((i+2) < c.length && c[i+2] == 0) {
            i++;
        }
        i++;
        minJumps++;
    }
    return minJumps;
}