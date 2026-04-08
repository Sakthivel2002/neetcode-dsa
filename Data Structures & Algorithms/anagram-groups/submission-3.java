class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word: strs){
            char[] arr= word.toCharArray();
            Arrays.sort(arr);
            String sorted_key = new String(arr);

            map.computeIfAbsent(sorted_key, k-> new ArrayList<>()).add(word);
        }
        for(String key: map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
}
