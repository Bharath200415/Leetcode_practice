class Solution {
    public int minimumCost(int[] nums) {
        int cost=Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i=1;i<nums.length;i++){
            if (nums[i]<cost){
                min2 = cost;
                cost = nums[i];
            }else if (nums[i]<min2){
                min2 = nums[i];
            }
        }
        return cost+min2+nums[0];
        
    }
}