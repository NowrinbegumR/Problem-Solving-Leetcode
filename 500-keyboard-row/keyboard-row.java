class Solution {
    public String[] findWords(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        for(char ch : r1.toCharArray()) map.put(ch,1);
        for(char ch : r2.toCharArray()) map.put(ch,2);
        for(char ch : r3.toCharArray()) map.put(ch,3);
        List<String> res = new ArrayList<>();
        for(String word : words){
            int row = map.get(Character.toLowerCase(word.charAt(0)));
            boolean valid = true;
            for(char ch : word.toCharArray()){
                if (map.get(Character.toLowerCase(ch)) != row){
                valid = false;
                break;
            }
        }
        if(valid){
            res.add(word);
        }
        
    }
    return res.toArray(new String[0]);
    }
     

}