class Solution {
    int ans = 0 ;
    public int findCircleNum(int[][] isConnected) {
        Boolean[] vis = new Boolean[isConnected.length];
        for(int i = 0 ; i< isConnected.length;i++){
            vis[i] = false;
        }
        for (int i = 0; i < isConnected.length; i++) {
            if (!vis[i]) {
                BFS(isConnected, vis, i);
                ans++;
            }
        }
        return ans;
    }

    public void  BFS(int[][] isConnected ,Boolean[] vis, int start){
        Queue<Integer>q = new LinkedList<>();
        q.add(start);
        vis[start] = true;
        while(!q.isEmpty()){
          int n = q.poll();
          for(int i =0 ; i< isConnected.length;i++){
              if(isConnected[n][i] == 1 && !vis[i]){
                  vis[i] = true;
                  q.add(i);
              }
          }
        }
    }
}