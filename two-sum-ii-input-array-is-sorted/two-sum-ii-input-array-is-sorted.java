class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            if(numbers[first]+numbers[last]==target)
                break;
            if(numbers[first]+numbers[last]>target)
                last--;
            if(numbers[first]+numbers[last]<target)
                first++;
        }
        int[] out=new int[2];
        out[0]=first+1;
        out[1]=last+1;
        return out;
    }
}
