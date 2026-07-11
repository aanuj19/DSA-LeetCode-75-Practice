class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int minr = 0;
        int minc = 0;
        int maxr = m-1;
        int maxc = n-1;

        while(minr <= maxr && minc <= maxc){
            //left to right
            for(int i=minc; i<=maxc; i++){
                ans.add(matrix[minr][i]);
            }
            minr++;
            if(minc > maxc || minr > maxr) break;
            // right to bottom
            for(int i=minr; i<=maxr; i++){
                ans.add(matrix[i][maxc]);
            }
            maxc--;
            if(minc > maxc || minr > maxr) break;
            //botton to left
            for(int i=maxc; i>=minc; i--){
                ans.add(matrix[maxr][i]);
            }
            maxr--;
            if(minc > maxc || minr > maxr) break;
            for(int i=maxr; i>=minr; i--){
                ans.add(matrix[i][minc]);
            }
            minc++;
            if(minc > maxc || minr > maxr) break;

        }
        return ans;
    }
}