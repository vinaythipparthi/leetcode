class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str = tokens[i];
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int ans = 0;
                if(str.equals("+")){
                    ans = temp2 + temp1;
                }
                else if(str.equals("-")){
                    ans = temp2 - temp1;
                }
                else if(str.equals("*")){
                    ans = temp2 * temp1;
                }
                else if(str.equals("/")){
                    ans = temp2 / temp1;
                }
                stack.push(ans);
            }else{
                int val = Integer.parseInt(str);
                stack.push(val);
            }
        }
        return stack.peek();
    }
}