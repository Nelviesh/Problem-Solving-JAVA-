class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int size = n1 + n2;
        int result[] = new int[size];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Add remaining elements from arr1
        while (i < n1) {
            result[k++] = nums1[i++];
        }

        // Add remaining elements from arr2
        while (j < n2) {
            result[k++] = nums2[j++];
        }
double arrayval=0;
        if(size%2==0){
            int h=size/2;
             arrayval=result[h]+result[h-1];
            
        }
        else {
             arrayval =result[size/2];
             return arrayval;
        }
        return arrayval/2 ;
    }
}