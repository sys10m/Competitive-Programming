class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        whlie(nums1.length > 2 && nums2.length >2){
            if (findMedianEdge(nums1) >= findMedianEdge(nums2)){
                
            }
        }
    }

    // @return the number of indexes which does not affect the median value in one side
    public int findMedianEdge(int[] nums){
        return (nums.length % 2 == 0)? nums.length/2 - 1: nums.length/2;
    }
}
