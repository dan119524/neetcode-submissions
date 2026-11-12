class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();
        for(String word : strs){
            char[] Letters = word.toCharArray();
            Arrays.sort(Letters);
            String key = new String(Letters);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    

    }
}
