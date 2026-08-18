class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<=n-k;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<i+k && j<n;j++){
                int val = nums[j];
                set.add(val);
            }
            for(int val:set){
                map.put(val, map.getOrDefault(val,0)+1);
            }
        }
        //
        int ans = -1;
        for(int val:map.keySet()){
            if(map.get(val) == 1){
                ans = Math.max(ans, val);
            }
        }
        return ans;
    }
}