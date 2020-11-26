class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        else if(nums.length==1)
            return 1;
        else{
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
