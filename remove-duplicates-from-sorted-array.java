class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        else if(nums.length==1)
            return 1;
        else{
         /*
         This can be solved using two pointer technique so that Time Complexity is O(n).
         Only else block will change.
         
         else{
                int write_pointer=1,read_pointer=1;
                for(;read_pointer<nums.length;read_pointer++){
                    if(nums[read_pointer]!=nums[read_pointer-1]){
                        
                        nums[write_pointer]=nums[read_pointer];
                        write_pointer++;
                    }
                }
            return write_pointer;
            }
         
         */
                int i=0,j=1;
                boolean check;
                while(true)
                {
                    if(j==nums.length)
                        return j+1;
                    check=false;
                    while(nums[i]==nums[j]){
                        check=true;
                        j++;
                        if(j==nums.length)
                            return i+1;
                        if(nums[j]>nums[i])
                            {
                            i+=1;
                            nums[i]=nums[j];
                            }
                      }
                    if(check==false){
                        i+=1;
                        j+=1;
                    }
                }           
            }
        }
    }
​
