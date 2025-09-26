class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first= firstelement(nums,target);
        int last =lastelement(nums,target);
        return new int []{first, last};
    }
  public int  firstelement(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
            }
             if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return index;
    }
    public int lastelement(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
            }
             if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return index;
    }
}