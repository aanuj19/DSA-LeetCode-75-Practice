class Solution {
    public String reverseVowels(String s) {
        StringBuilder finalString = new StringBuilder("");
        List<Character> vowels = new ArrayList<>();
        vowels.addAll(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        List<Character> vowelsInString = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                vowelsInString.add(s.charAt(i));
            }
        }
        Collections.reverse(vowelsInString);
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                finalString.append(vowelsInString.get(j));
                j++;
            }else{
                finalString.append(s.charAt(i));
            }
        }

        return finalString.toString();
    }
}