class Solution {
    public long maxSumTrionic(int[] nums) {

        int n = nums.length;
        long res= -1*(long)1e16;

        for (int i=1;i<n-2;i++){
            int a=i;
            int b=i;

            long net = nums[a]; //sum for the midd decreaseing valley

            while (b+1<n && nums[b+1]<nums[b]){
                net+=(long)nums[b+1];
                b++;
            }

            if (b==a)continue;

            int c =b; //c is the end of the decreasing valley
            long left=0;
            long right=0;

            long lx = Long.MIN_VALUE;
            long rx = Long.MIN_VALUE;

            int pastA=a;
            while (a-1>=0 && nums[a-1]<nums[a]){
                left+=(long)nums[a-1];
                lx = Math.max(lx,left);
                a--;
            }
            if (a==pastA) continue;

            while (b+1<n && nums[b+1]>nums[b]){
                right+=(long)nums[b+1];
                rx = Math.max(rx,right);
                b++;
            }
            if (c==b) continue;

            i=b-1;
            res = Math.max(res,lx+rx+net);



        }
        return res;

        
    }
}