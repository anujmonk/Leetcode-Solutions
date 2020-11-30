class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr==null || arr.length==0)
            return null;
        else if(arr.length==1){
            arr[0]=-1;
            return arr;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(i==arr.length-1){
                    arr[i]=-1;
                }
                else{
                    int max=i+1;
                    for(int j=max+1;j<arr.length;j++){
                        if(arr[max]<arr[j])
                            max=j;
                    }
                    arr[i]=arr[max];
                }
            }
        }
        return arr;
    }
}
