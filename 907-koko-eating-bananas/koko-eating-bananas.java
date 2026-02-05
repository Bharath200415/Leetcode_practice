class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for (int i:piles){
            max = Math.max(max,i);
        }
        int l=1;
        int r= max, ans=max;

        while (l<=r){
            int k = (l+(r-l)/2);
            long op=0;

            for (int x:piles){
                op+=(x+k-1)/k;
                if (op>h)break;
            }
            if (op<=h){
                ans = k;
                r= k-1;
            }else{
                l=k+1;
            }
        }
        return ans;       
    }
}