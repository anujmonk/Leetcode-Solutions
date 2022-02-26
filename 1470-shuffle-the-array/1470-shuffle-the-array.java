class Solution {
    public int[] shuffle(int[] nums, int n) {
        
       //Brute Force to create a new array and two pointer
        
        int[] arr = new int[nums.length];
        
        int low=0,high=n;
        for(int i=0;i<nums.length;i+=2) {
            arr[i]=nums[low];
            arr[i+1]=nums[high];
            low++;
            high++;
        }
        return arr;
        
        // Important Concept of storing two numbers in a single number
        /**
            we can store nums[k]= nums[i] *MAX_VALUE +nums[j]
            now to retrieve nums[i] from nums[k] 
            we can do nums[k]/MAX_VALUE
            
            To retrieve nums[j] from nums[k]
            we can do nums[k]%MAX_VALUE
        */
        
    }
}
