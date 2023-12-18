class RnaTranscription {
    private static String returnStrand(char dnaStrand) {
        if(dnaStrand == 'G') return "C";
        if(dnaStrand == 'C') return "G";
        if(dnaStrand == 'T') return "A";
        if(dnaStrand == 'A') return "U";
        return "";
    }
    
    String transcribe(String dnaStrand) {
        String ans = "";
        for(int i=0; i<dnaStrand.length(); i++) {
            ans += returnStrand(dnaStrand.charAt(i));
        }
        return ans;
    }
}
