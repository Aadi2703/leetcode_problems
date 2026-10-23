class Solution {
    public int singleNumber(int[] nums) {
    HashMap<Integer,Integer> box = new HashMap<>();
        for(int i =0;i<nums.length;i++){
box.put(nums[i],box.getOrDefault(nums[i],0)+1);

        }
        for(int i =0;i<nums.length;i++){
    if(box.get(nums[i])==1){
            return nums[i];
            }
        }
        return -1;
    }
}