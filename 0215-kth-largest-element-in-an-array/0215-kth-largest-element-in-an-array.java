class Solution {
    public int findKthLargest(int[] nums, int k) { // nlogk--> TRAVERSE+MINHEAP OF K SIZE
        // usig min-heap
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.offer(nums[i]);
            if(minHeap.size()>k){
                minHeap.poll();// remove smallest
            }
        }
        return minHeap.peek();// return kth largest from start
    }
}
