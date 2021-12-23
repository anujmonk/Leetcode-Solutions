class Solution {
    public void setZeroes(int[][] matrix) {
        
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j);
                if(matrix[i][j]==0 && !set.contains(l)) {
                    setZero(matrix,i,j,set);
                }
            }
        }
    }
    
    private void setZero(int[][] matrix, int rN,int cN,Set<List<Integer>> set) {
        List<Integer> l = new ArrayList<>();
        l.add(rN);
        l.add(cN);
        set.add(l);
        int r =rN;
        int c=cN;
        while(r>=0) {
            if(matrix[r][c]!=0) {
                matrix[r][c]=0;
                l = new ArrayList<>();
                l.add(r);
                l.add(c);

                set.add(l);
                
            }
            r--;
        }
        r=rN;
        while(r<matrix.length) {
            if(matrix[r][c]!=0) {
                matrix[r][c]=0;
                l = new ArrayList<>();
                l.add(r);
                l.add(c);
                set.add(l);
                
            }
            r++;
        }
        r=rN;
        while(c>=0) {
            if(matrix[r][c]!=0) {
                matrix[r][c]=0;
                l = new ArrayList<>();
                l.add(r);
                l.add(c);
                set.add(l);
                
            }
            c--;
        }
        c=cN;
        while(c<matrix[r].length) {
            if(matrix[r][c]!=0) {
                matrix[r][c]=0;
                l = new ArrayList<>();
                l.add(r);
                l.add(c);
                set.add(l);
                
            }
            c++;
        }
        
        
    }
    
}