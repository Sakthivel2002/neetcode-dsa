class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch: s.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        
        for(char c: t.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        for(char key: map1.keySet()){
            
            if(!map1.get(key).equals(map2.get(key))){
                return false;
            }
        }
        return true;
    }
}
