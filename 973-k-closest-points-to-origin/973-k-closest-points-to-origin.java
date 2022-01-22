class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        Queue<int[]> heap = new PriorityQueue<>((a,b) ->square(b[0],b[1]) - square(a[0],a[1]));
        
        for(int[] point:points) {
            if(heap.size()<k) {
                heap.add(point);
            }
            else {
                int[] a = heap.peek();
                if(square(a[0],a[1]) > square(point[0],point[1]))
                {
                    heap.remove();
                    heap.add(point);
                }
            }
        }   
        int j=0;
        int[][] ans = new int[k][2];
        while(!heap.isEmpty()) {
            ans[j++]=heap.remove();
        }
        
        return ans;
    }
    
    
    private int square(int a,int b) {
        
        return a*a+b*b;
    }
}