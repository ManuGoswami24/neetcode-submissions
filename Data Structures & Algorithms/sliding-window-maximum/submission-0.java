class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<Integer> pq = 
        new PriorityQueue<>((a,b)-> Integer.compare(b,a));
        int [] result = new int[nums.length-k+1];

        for (int i=0; i<nums.length ; i++){
            
            pq.offer(nums[i]);
            
            if (i>=k-1){
                result[i-k+1]= pq.peek();
                pq.remove(nums[i-k+1]);
            }
        }
        return result ;
        
    }
}
