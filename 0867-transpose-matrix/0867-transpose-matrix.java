class Solution {
    public int[][] transpose(int[][] matrix) {

       //old Array

        int totalrow=matrix.length;
        int totalcol=matrix[0].length;

        // New Array

        int newtotalrow=totalcol;
        int newtotalcol=totalrow;
        int ans[][]=new int[newtotalrow][newtotalcol];
        
        for(int row=0;row<totalrow;row++){
             for(int col=0;col<totalcol;col++){
            ans[col][row]=matrix[row][col];
           }
        }
        return ans;
    }
}