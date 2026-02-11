class Solution {
    public boolean isUgly(int n) {
        boolean res=false;
        if (n<=0)return false;

        HashSet<Integer> h1 = new HashSet<>();
        h1.add(2);
        h1.add(3);
        h1.add(5);
        int orig=n;

        for(int i:h1){
            while (n%i==0){
                n/=i;
            }
        }
        return n==1;

        
    }
}