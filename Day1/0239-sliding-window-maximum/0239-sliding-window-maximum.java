class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int index=0;
        int n=nums.length;
        Deque<Integer> deq= new LinkedList<>();
        int []res=new int [n-k+1];
        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && deq.peekFirst()<=i-k ){
                deq.pollFirst();
            }
            while(!deq.isEmpty() && nums[i]>=nums[deq.peekLast()]){
                deq.pollLast();
            }
            deq.offerLast(i);
            if(i>=k-1){
                res[index]=nums[deq.peekFirst()];
                index++;
            }


        }
        return res;
    }
}