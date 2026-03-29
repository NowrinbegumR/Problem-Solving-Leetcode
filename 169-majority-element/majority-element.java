 class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length/2;
        
        for(int word : nums){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(int word : nums){
            if(map.get(word)>n){
                return word;
            }
        }
    return -1;
    }
 }  