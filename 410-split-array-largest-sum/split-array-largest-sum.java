class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int num:nums){
            start = Math.max(num,start);
            end+=num;
        }
        while (start<=end){
            int sum = 0;
            int splits=1;
            int mid = start+(end-start)/2;

            for (int num:nums){
                if (num+sum>mid){
                    splits+=1;
                    sum = num;
                }else{
                    sum+=num;
                }
            }
            if (splits>k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}