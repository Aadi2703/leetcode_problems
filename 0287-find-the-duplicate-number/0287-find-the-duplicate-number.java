class Solution {
    public int findDuplicate(int[] nums) {
       // ArrayList<Integer> box = new ArrayList<>();
       HashSet<Integer> box = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(box.contains(nums[i])){
return nums[i];
            }
            box.add(nums[i]);
        }
        return -1;
    }
}