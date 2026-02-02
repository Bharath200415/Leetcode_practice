class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mappings= new HashMap<Character,Integer>();
        mappings.put('I',1);
        mappings.put('V',5);
        mappings.put('X',10);
        mappings.put('L',50);
        mappings.put('C',100);
        mappings.put('D',500);
        mappings.put('M',1000);

        int n = s.length();

        int sum=0;

        for (int i=0;i<n;i++){
            int val = mappings.get(s.charAt(i));

            if ((i+1)<n && val<mappings.get(s.charAt(i+1))){
                sum-=val;
            }else{
                sum+=val;
            }
            
        }
        return sum;
    }
}