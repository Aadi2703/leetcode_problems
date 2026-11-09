class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct = nums[0];
        int minproduct = nums[0];
        int result = nums[0];
        for(int i = 1;i<nums.length;i++){
            int maxtemp = maxproduct;
            int mintemp = minproduct;
            maxproduct = Math.max(nums[i],Math.max(nums[i]*mintemp,nums[i]*maxtemp));
            minproduct = Math.min(nums[i],Math.min(nums[i]*mintemp,nums[i]*maxtemp));
result = Math.max(result,maxproduct);
        }
        return result;
    }
}