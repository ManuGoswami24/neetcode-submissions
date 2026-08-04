class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int lo=1;
        int high=0;

        for (int pile:piles){
            high = Math.max(high,pile);
        }

        int ans=high;

        while(lo<=high){
            int mid= lo + (high-lo)/2;

            if (canFinish(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    public boolean canFinish(int[] piles, int h, int speed){
        long hours=0;

        for (int pile: piles){
            hours += (pile + speed -1)/speed; 
        }

        if (hours>h){
            return false;
        }

        return true ;
    }
}
