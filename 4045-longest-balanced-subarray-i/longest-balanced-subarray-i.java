class Solution {
    public int longestBalanced(int[] nums) {
        int res=0;
        for (int i=0;i<nums.length-1;i++){
            Set<Integer> h1= new HashSet<>();
            Set<Integer> h2 = new HashSet<>();
            if (nums[i]%2==0){
                h1.add(nums[i]);
            }else{
                h2.add(nums[i]);
            }
            for (int j=i;j<nums.length;j++){
                if (nums[j]%2==0){
                    h1.add(nums[j]);
                }else{
                    h2.add(nums[j]);
                }
                if (h1.size()==h2.size()){
                    res = Math.max(j-i+1,res);
                }
            }
        }

        return res;
        
        
    }
}