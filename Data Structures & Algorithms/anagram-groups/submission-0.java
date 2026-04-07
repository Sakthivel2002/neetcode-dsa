class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for(String word: strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted_word = new String(arr);
            if(map.containsKey(sorted_word)){
                List<String> list = map.get(sorted_word); 
                list.add(word);
                map.put(sorted_word, list);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(word);
                map.put(sorted_word, temp);
            }
        }
        for(String key: map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
