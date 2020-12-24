class Solution {
    public boolean isHappy(int n) {
        Set<Integer> check_loop =new HashSet<Integer>();
        int sum=0;
        int rem=0;
        if(n<0)
            return false;
        while(true){
            rem=n%10;
            sum+=(rem*rem);
            n=n/10;
            if(n==0){
                if(check_loop.contains(sum))
                    break;
                n=sum;
                sum=0;
                check_loop.add(n);
            }
        }
        if(sum==1)
            return true;
        return false;
    }
}
