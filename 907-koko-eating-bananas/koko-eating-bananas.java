class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=1;
        for (int pile:piles){
            r=Math.max(r,pile);
        }
        
        int ans = r;
        while (l<=r){
            int mid=(l+(r-l)/2);
            if (canEat(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }

        }
        return ans;
        
    }
    private boolean canEat(int[]piles, int h, int mid){
        long hours=0;
        for (int i:piles){
            hours+=(i+mid-1)/mid;
        }
        if (hours<=h){
            return true;
        }else{
            return false;
        }
    }
}