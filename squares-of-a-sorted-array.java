class Solution {
    public int[] sortedSquares(int[] A) {
        // Brute Force - Squaring and then sorting using Arrays.sort()
        
        for(int i=0;i<A.length;i++)
            A[i]=A[i]*A[i];
        Arrays.sort(A);
        return A;
    }
}
