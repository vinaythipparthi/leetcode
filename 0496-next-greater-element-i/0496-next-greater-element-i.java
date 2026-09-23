class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Optimized using stack and HashMap
        //1. store every greater element in hashmap
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n2;i++){
            // int val = nums2[i];
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                int prev = stack.pop();
                map.put(prev, nums2[i]);
            }

            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        //2. store next greater element in the array
        for(int i=0;i<n1;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}