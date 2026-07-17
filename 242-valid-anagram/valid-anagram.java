class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> sMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(sMap.containsKey(s.charAt(i))){
                int freq = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), freq +1);
            }else{
                sMap.put(s.charAt(i), 1);
            }
        }
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            if(tMap.containsKey(t.charAt(i))){
                int freq = tMap.get(t.charAt(i));
                tMap.put(t.charAt(i), freq +1);
            }else{
                tMap.put(t.charAt(i), 1);
            }
        }
        for(char key : sMap.keySet()){
            int val1 = sMap.get(key);
            if(!tMap.containsKey(key)) return false;
            int val2 = tMap.get(key);
            if (val1 != val2) return false;
        }
        return true;
    }
}