class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
    boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                }
            }
            if (!found && !set1.contains(nums1[i])) {
                set1.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
        found = true;
     }
            }
            if (!found && !set2.contains(nums2[i])) {
set2.add(nums2[i]);
     }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(set1);
        ans.add(set2);

        return ans;
    }
}