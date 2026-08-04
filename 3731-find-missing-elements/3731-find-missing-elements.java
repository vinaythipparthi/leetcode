class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        //frequency check
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        for(int i:nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        int[] arr = new int[max+1];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        List<Integer> li = new ArrayList<>();
        for(int i=min;i<max;i++){
            if(arr[i] == 0){
                li.add(i);
            }
        }
        return li;
    }
}