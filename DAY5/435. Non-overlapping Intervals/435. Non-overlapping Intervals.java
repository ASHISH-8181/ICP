class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count=0;
        int last=Integer.MIN_VALUE;// this will show us the last index value
        for(int[]i: intervals){ 
            if(i[0]<last){// overlap found 
            count++;}
            else{
            last=i[1];// store the last interval
            }

        }
            return count;      
    }
}
