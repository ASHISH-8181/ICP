class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        Arrays.sort(points,(a,b)-> Integer.compare(a[0],b[0]));
        int prev[]=points[0];
        int count=1;
        for(int i=0;i<n;i++){
            int cStart=points[i][0];
            int cEnd=points[i][1];
            int pStart=prev[0];
            int pEnd=prev[1];
            if(cStart> pEnd){// no overlapping
            count++;
            prev=points[i];// change cuur to prev

            }
            else{
                prev[0]=Math.max(pStart,cStart);
                prev[1]=Math.min(pEnd,cEnd);
            }
        }
        return count;
    }
}
