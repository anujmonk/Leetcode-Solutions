class Solution {
    public int mySqrt(int x) {
        int l=0,h=x,ans=0;
        while(l<=h){
            long m=l+(h-l)/2;
            if(m*m==x)
                return (int)m;
            else if(m*m>x)
                h=(int)m-1;
            else{
                l=(int)m+1;
                ans=(int)m;
            }
        }
        return ans;
    }
}

