class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for(String word: strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted_word = new String(arr);
            map.computeIfAbsent(sorted_word, k -> new ArrayList<>()).add(word);
        }
        for(String key: map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
