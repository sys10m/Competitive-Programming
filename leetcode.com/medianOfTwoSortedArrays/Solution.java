class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int startNums1 = 0;
        int startNums2 = 0;
        int endNums1 = nums1.length - 1;
        int endNums2 = nums2.length - 1;
        
        while((endNums1 - startNums1) > 1 && (endNums2 - startNums2) > 1){
            // find least edge
            int toCut = findLeastEdge(startNums1, endNums1, startNums1, endNums2);
            // cut ending from nums1
            if(getMedian(nums1, startNums1, endNums1) >= getMedian(nums2, startNums2, endNums2)){
                startNums2 += toCut;
                endNums1 -= toCut;
            }
            // cut ending from nums2
            else{
                startNums1 += toCut;
                endNums2 -= toCut;
            }
        }
        // do when there is one array with only 2 elements

    }

    public double getMedian(int[] nums, int startAddress, int endAddress){
        double median = (double) nums[(startAddress + endAddress) / 2];
        if ((endAddress - startAddress) % 2 == 1){
            median = (median + nums[((startAddress + endAddress) / 2) + 1]) / 2;
        }
        return median
    }

    public int findLeastEdge(int startAddress1, int endAddress1, int startAddress2, int endAddress2){
        return (getEdgeLength(startAddress1, endAddress1) <= getEdgeLength(startAddress2, endAddress2))? getEdgeLength(startAddress1, endAddress1): getEdgeLength(startAddress2, endAddress2);
    }

    public int getEdgeLength(int startAddress, int endAddress){
        int edge = endAddress - startAddress;
        if (edge % 2 == 1){
            edge = (edge / 2) - 1;
        }
        else{
            edge = edge / 2;
        }
        return edge;
    }
}
