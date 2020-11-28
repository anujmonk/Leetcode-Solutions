class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j==i)
                    continue;
                if(arr[j]==2*arr[i])
                    return true;
            }
        }
        return false;
    }
}
