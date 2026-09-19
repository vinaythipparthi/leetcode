class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> li = new ArrayList<>();
        solve(0,target,candidates,li);
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int index, int target, int[] candidates, List<Integer> li){
        //base case
        if(target == 0){
            if(!ans.contains(li)){
                ans.add(new ArrayList<>(li));
            }
            return;
        }
        if(target<0 || index== candidates.length)   return;
        //take
        li.add(candidates[index]);
        solve(index, target-candidates[index], candidates, li);
        li.remove(li.size()-1);
        //skip
        solve(index+1, target, candidates, li);
    }
}