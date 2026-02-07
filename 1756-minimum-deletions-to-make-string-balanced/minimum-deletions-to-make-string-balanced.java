class Solution {
    public int minimumDeletions(String s) {
        
        int countofB=0;
        int mindeletions=0;

        for (char c:s.toCharArray()){
            if (c=='b'){
                countofB++;
            }else{
                mindeletions= Math.min(mindeletions+1,countofB);
            }
        }
        return mindeletions;

        
    }
}