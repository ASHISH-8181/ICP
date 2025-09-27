class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
       int n=nums2.length;
        int []nums3=new int [m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else{
                nums3[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            nums3[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n){
            nums3[k]=nums2[j];
            k++;
            j++;
        }
        int p=nums3.length;
        double median=0;
        if(p%2==0){
            median=(nums3[(p/2)-1]+nums3[p/2])/2.0;
        }
        else{
            median =nums3[((p+1)/2)-1];
        }

        return median;
    }
}