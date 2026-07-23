import java.util.ArrayDeque;
import java.util.ArrayList;

public class Graph{
    public static void main(String[] args){
        int n = 9;
int[][] edges = {
    {0,1},
    {0,2},
    {1,3},
    {1,4},
    {2,5},
    {2,6},
    {4,7},
    {5,8}
};
        //create adj list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            // for undirected graph ->add at both index
            list.get(u).add(v);
            list.get(v).add(u);
        }
        for(ArrayList<Integer> arr : list){
            System.out.println(arr);
        }
        bfs(n, list);

    }
    public static void bfs(int n, ArrayList<ArrayList<Integer>> list){
        //create the visited array
        boolean[] vis = new boolean[n];
        
        //create queue
        ArrayDeque<Integer> queue =new ArrayDeque<>();

        //mark starting node as visited and add in queue
        vis[0]= true;
        queue.offer(0);

        
        while(!queue.isEmpty()){
            int i = queue.poll();
            System.out.println(i);
            for(int con : list.get(i)){
                if(!vis[con]){
                    vis[con] =true;
                    queue.offer(con);
                }
            }
        }


    }
    public static void dfs(int n, ArrayList<ArrayList<Integer>> list){
        
    }

}