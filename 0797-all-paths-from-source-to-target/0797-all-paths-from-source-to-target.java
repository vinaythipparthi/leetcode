class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        dfs(0, adj.size()-1, li, ans, adj);
        return ans;
    }
    public void dfs(int root, int destination, List<Integer>li, List<List<Integer>> ans, List<List<Integer>> adj){
        if(root == destination){
            li.add(root);
            ans.add(new ArrayList<>(li));
            li.remove(li.size()-1);
            return;
        }

        li.add(root);
        for(int i=0;i<adj.get(root).size();i++){
            int currNode = adj.get(root).get(i);
            
            //
            dfs(currNode, destination, li, ans, adj);
        }
        li.remove(li.size()-1);
    }
}