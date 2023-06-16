//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


// class Solution {
//     // Function to detect cycle in an undirected graph.
//     public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
//         boolean[] vis = new boolean[V];
        
//         for(int i=0;i<=V;i++){
//             if(vis[i] == false){
//                 if(detect(i, -1, vis, adj)) return true;
//             }
//         }
//         return false;
//     }
//     private boolean detect(int src, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
//         vis[src] = true;
//         for(int adjnode : adj.get(src)){
//                 if(vis[adjnode] == false){
//                     if(detect(adjnode, src, vis, adj)) return true;
//                 } else if(adjnode!=parent) return true;  
//             }     
//         return false;
//     }
// }


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] vis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(i,-1,vis,adj)==true) return true;
            }
        }
        return false;
    }
    public boolean dfs(int node,int parent,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for(Integer it: adj.get(node)){
            if(vis[it]==0){
                if(dfs(it,node,vis,adj)==true) return true;
                
            }else if(it!=parent) return true;
        }
        return false;
    }
}