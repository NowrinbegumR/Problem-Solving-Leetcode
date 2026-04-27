class Solution {
    public int minOperations(int[] nums, int k) {
        int tot = 0;
        for(int i = 0; i < nums.length;i++){
            tot += nums[i];
            int ans = tot % k;

        }
        int ans = tot % k;
        return ans;
        
    }
   
}