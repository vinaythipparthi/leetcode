class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        for(int i=nums[0];i<=nums[n-1];i++){
            li.add(i);
        }
        //
        List<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i < n){
            if(nums[i] == li.get(j)){
                // ans.add(nums[i]);
                i++;
                j++;
            }else{
                ans.add(li.get(j));
                j++;
            }
        }
        return ans;

    }
}