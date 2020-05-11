static int[] rotLeft(int[] a, int d) {
    int []output = new int[a.length];
    int i = d % a.length;
    int j = 0;
    while(j < a.length) {
        output[j] =  a[i];
        i = (i+1) % a.length;
        j++;
    }
    return output;
}
