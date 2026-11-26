class Solution {
    public int findMaximizedCapital(int k, int w, int[] profit, int[] capital) {
        int n=profit.length;
        int[][] projects=new int[n][2];
    for(int i=0;i<n;i++){
      projects[i][0]=capital[i];
      projects[i][1]=profit[i];
    }
    Arrays.sort(projects,(a,b)->Integer.compare(a[0],b[0]));
    PriorityQueue<Integer> maxProfitHeap=new PriorityQueue<>(Collections.reverseOrder());
    int i=0;
    for(int step=0;step<k;step++){
      while(i<n&&projects[i][0]<=w){
        maxProfitHeap.offer(projects[i][1]);
        i++;        
      }
      if(maxProfitHeap.isEmpty())break;
      w+=maxProfitHeap.poll();
    }
    return w;
    }
}