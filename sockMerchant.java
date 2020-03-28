static int sockMerchant(int n, int[] ar) {
    int noOfPairs = 0;
    for (int i=0; i<ar.length-1; i++){
        if(ar[i] != 0) {
            for(int j=i+1; j<ar.length; j++) {
                if(ar[i] == ar[j]) {
                    ar[j] = 0;
                    noOfPairs++;
                    break;
                }
            }
        }
    }
    return noOfPairs;
}

static int sockMerchant(int n, int[] ar) {
	int noOfPairs = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<ar.length; i++) {
        map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
    }
    for(int val : map.values()){
        noOfPairs += (val / 2);
    }
    return noOfPairs; 
}

static int sockMerchant(int n, int[] ar) {
	int noOfPairs = 0;
    Set<Integer> set = new HashSet<>();
    for(int i=0; i<ar.length; i++) {
       if(set.remove(ar[i])){
           noOfPairs++;
       }else{
           set.add(ar[i]);
       }
    }
    return noOfPairs; 
}