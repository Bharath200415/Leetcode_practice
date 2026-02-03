class Solution {
    public int secondHighest(String s) {
        int n = s.length()-1;
        int largest  = Integer.MIN_VALUE;
        int secondlarg = Integer.MIN_VALUE;

        for(int i= 0;i<=n;i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                if ((c-'0')>largest){
                    secondlarg = largest;
                    largest = c-'0';
                }
                if ((c-'0')<largest && (c-'0')>secondlarg){
                    secondlarg = c-'0';
                }
            }
        }
        if (secondlarg!=Integer.MIN_VALUE){
            return secondlarg;
        }else{
            return -1;
        }
        
    }
}