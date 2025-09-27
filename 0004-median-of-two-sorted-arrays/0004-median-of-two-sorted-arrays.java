class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length){ // num1 should be smaller
            return findMedianSortedArrays(nums2,nums1);
        }
        int m=nums1.length;
        int n=nums2.length;
        int low=0;
        int high=m;
        while(low<=high){// binary search on num1
            int i=(low+high)/2;//mid
            int j=(m+n+1)/2-i;// partition in nums2
            int maxLeft1=(i==0)?Integer.MIN_VALUE:nums1[i-1];
            int minRight1=(i==m)?Integer.MAX_VALUE:nums1[i];
            int maxLeft2=(j==0)?Integer.MIN_VALUE:nums2[j-1];
            int minRight2=(j==n)?Integer.MAX_VALUE:nums2[j];

            if(maxLeft1<=minRight2 && maxLeft2<=minRight1){// correct partition
                if((m+n)%2==0){//median even
                    return (Math.max(maxLeft1,maxLeft2)+ Math.min(minRight1,minRight2))/2.0;
                }
                else{
                    return Math.max(maxLeft1,maxLeft2);
                }
            }
            else if( maxLeft1>minRight2){
                    high=i-1;
                }
            else{
                    low=i+1;
                }
            
        }
        return -1;
    }
}