class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i+=2*k){
            int end=Math.min(i+k,s.length());
            String reversedPart=new StringBuilder(s.substring(i,end)).reverse().toString();
            sb.replace(i,end,reversedPart);
        }
        
        return sb.toString();
    }
}