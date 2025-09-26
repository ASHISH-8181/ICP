class Solution {
    public int findMinArrowShots(int[][] points) {
        int n= points.length;
    Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
     int prev= points[0][1];
     int count=1;
     for(int i=1;i<n;i++){
        // int currStart=points[i][0];
        // int currEnd=points[i][1];
        // int prevStart=prev[0];
        // int prevEnd=prev[1];

        if(points[i][0]<=prev){ 
            // no overlap
             continue;
           
        }
        else{
          count++;
            
            prev=points[i][1];
        }

     }

        return count;
    }
}