class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        List<Integer> b = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                b.add(nums[i]);
            }else{
                a.put(nums[i],1);
            }
        }
        return b;
    }
}