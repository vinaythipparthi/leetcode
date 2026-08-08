class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap Approach
        HashMap<Integer, Integer> map = new HashMap<>();
        int ind1 = 0;
        int ind2 = 0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            int res = target-val;
            if(map.containsKey(res)){
                ind1 = map.get(res);
                ind2 = i;
                break;
            }else{
                map.put(val,i);
            }
        }
        //
        return new int[]{ind1, ind2};
    }
}