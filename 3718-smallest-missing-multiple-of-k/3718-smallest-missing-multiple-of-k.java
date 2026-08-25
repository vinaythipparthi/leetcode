class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        int ans = 1;
        while(true){
            if(ans%k == 0 && !set.contains(ans)){
                break;
            }
            ans++;
        }
        return ans;
    }
}