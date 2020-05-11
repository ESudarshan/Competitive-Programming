static int countingValleys(int n, String s) {
    // UDDDUDUU => 0 1 0 -1 -2 -1 -2 -1 0
    // DDUUUUDD => 0 -1 -2 -1 0 1 2 1 0
    int noOfValleys = 0;
    int lastStep = 0
    int currentStep = 0;
    for(int i=0; i<s.length(); i++) {            
        if(s.charAt(i) == 'U') {
            currentStep++;
        }else {
            currentStep--;
        }
        if(lastStep == 0 && currentStep == -1) {
            noOfValleys++;
        }
        lastStep = currentStep;
    }
    return noOfValleys;
}