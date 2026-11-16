class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD=1000000007;
        long totalOddSubarrays=0;

        int prefixSum=0;
        int evenCount=1;
        int oddCount=0;
        for(int i:arr){
            prefixSum+=i;
            if(prefixSum%2!=0){
                totalOddSubarrays=(totalOddSubarrays+evenCount)%MOD;
                oddCount++;
            }
            else{
                totalOddSubarrays=(totalOddSubarrays+oddCount)%MOD;
                evenCount++;
            }
        }
        return (int) totalOddSubarrays;
    }
}