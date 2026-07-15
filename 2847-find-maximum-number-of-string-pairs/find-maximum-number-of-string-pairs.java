class Solution {
    public String reverse(String s){
        StringBuilder revStr = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            revStr = revStr.append(s.charAt(i));
        }
        return revStr.toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(int i=0; i< words.length; i++){
            if(set.contains(reverse(words[i]))){
                count++;
            }else{
                set.add(words[i]);
            }
        }
        return count;
    }
}