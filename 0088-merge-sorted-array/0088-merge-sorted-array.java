class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer> box = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                box.add(nums1[i]);
                i++;
            } 
            else {
                box.add(nums2[j]);
                j++;
            }
        }

        while (i < m) {
            box.add(nums1[i]);
            i++;
        }

        while (j < n) {
            box.add(nums2[j]);
            j++;
        }
        for (int k = 0; k < box.size(); k++) {
            nums1[k] = box.get(k);
        }
    }
}