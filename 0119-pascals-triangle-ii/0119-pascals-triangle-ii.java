class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n=rowIndex+1;
        List<List<Integer>>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    arr.get(i).add(j,1);
                }
                else{
                    arr.get(i).add(j,arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
                }
            }
        }
        return arr.get(rowIndex);
    }
}