class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          List<Integer> ans = new ArrayList<>();
          
        int m=matrix.length;
        int n=matrix[0].length; 

        int startingrow = 0;
        int endingrow= m - 1;
        int startingcol = 0;
        int endingcol = n - 1;

        while (startingrow <= endingrow && startingcol <= endingcol) {

            // 1. Left to Right row wise
            for (int col = startingcol; col <= endingcol; col++) {
                ans.add(matrix[startingrow][col]);
            }
            startingrow++;

            // 2. Top to Bottom colum wise
            for (int row = startingrow; row <= endingrow; row++) {
                ans.add(matrix[row][endingcol]);
            }
            endingcol--;

            // 3. Right to Left. row wise
            if (startingrow <= endingrow) {
                for (int col = endingcol; col >= startingcol; col--) {
                    ans.add(matrix[endingrow][col]);
                }
                endingrow--;
            }

            // 4. Bottom to Top. colum wise
            if (startingcol <= endingcol) {
                for (int row = endingrow; row >= startingrow; row--) {
                    ans.add(matrix[row][startingcol]);
                }
                startingcol++;
            }
        }

        return ans;
    }
}