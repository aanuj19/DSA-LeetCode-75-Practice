class Solution {
    public String reverse(String s){
        StringBuilder revStr = new StringBuilder(s);
        return revStr.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(int i=0; i< words.length; i++){
            if(set.contains(reverse(words[i]))){
                count++;
                set.remove(words[i]);
            }else{
                set.add(words[i]);
            }
        }
        return count;
    }
}