class Solution {
    //aanuj.jain
    public String mergeAlternately(String word1, String word2) {
        StringBuilder finalString = new StringBuilder("");
        int i=0;
        while(i< word1.length() && i<word2.length()){
            finalString.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        if(word1.length() > word2.length()){
            finalString.append(word1.substring(word2.length())); 
        }else{
            finalString.append(word2.substring(word1.length())); 
        }
        return finalString.toString();
    }
}