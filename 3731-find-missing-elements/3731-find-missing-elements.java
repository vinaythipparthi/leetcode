class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        boolean flag1 = true;
        boolean flag2 = true;
        while(i<=j){
            if(!flag1 && !flag2)  break;
            if(nums[i]+1 == nums[i+1] && flag1){
                i++;
            }else{
                flag1 = false;
            }
            if(nums[j]-1 == nums[j-1] && flag2){
                j--;
            }else{
                flag2 = false;
            }
        }
        //
        List<Integer> ans = new ArrayList<>();
        for(int x=nums[i]+1;x<=nums[j]-1;x++){
            boolean flag = false;
            for(int num=i+1;num<=j-1;num++){
                if(nums[num] == x){
                    flag = true;
                    break;
                }
            }
            if(!flag)    ans.add(x);
        }
        return ans;

    }
}