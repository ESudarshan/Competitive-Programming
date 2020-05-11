static long repeatedString(String s, long n) {
    long occurrencesInSingleStr = noOfOccurrences(s, 'a');
    if(occurrencesInSingleStr == 0) {
        return 0;
    }
    long finalCount = 0;
    long noOfCompleteStr = n / s.length();
    long remainingChars = n % s.length();
    long occurrencesInRemainingSubstr = noOfOccurrences(s.substring(0, (int)remainingChars), 'a');
    finalCount = occurrencesInSingleStr * noOfCompleteStr + occurrencesInRemainingSubstr;
    return finalCount;
}

static long noOfOccurrences(String s, char a) {
    long occurrences = 0;
    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == a) {
            occurrences++;
        }
    }
    return occurrences;
}