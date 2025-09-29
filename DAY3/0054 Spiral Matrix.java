class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minrow=0;
        int mincol=0;
        int maxrow=matrix.length-1;
        int maxcol=matrix[0].length-1;
        int totalel= matrix.length*matrix[0].length;// calculate total number of elements
        int count=0;
        List<Integer> list= new ArrayList<>();
        while(count<totalel){

            // first row
            for(int i=mincol;i<=maxcol && count<=totalel;i++){
                list.add(matrix[minrow][i]);
                count++;// increase the count 
            }
            minrow++;
            // last col
        for(int i=minrow;i<=maxrow && count<totalel;i++){
            list.add(matrix[i][maxcol]);
            count++;
        }
        maxcol--;

        // last row
        for(int i=maxcol;i>=mincol  && count<totalel;i--){
            list.add(matrix[maxrow][i]);
            count++;
        }
        maxrow--;
        // firstcol
        for(int i=maxrow;i>=minrow  && count<totalel;i--){
            list.add(matrix[i][mincol]);
            count++;
        }
        mincol++;
        }
        
        return list;
    }
}
