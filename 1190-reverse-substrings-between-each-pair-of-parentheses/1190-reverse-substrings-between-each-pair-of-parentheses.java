class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            //edge case - if if there is an empty parenthesis skip it!
            if(!stack.isEmpty() && stack.peek() == '(' && ch == ')'){
                stack.pop();
                continue;
            }
            String str = "";
            while(!stack.isEmpty() && stack.peek() != '(' && ch == ')'){
                str += stack.pop();
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    for(int j=0;j<str.length();j++){
                        char chr = str.charAt(j);
                        stack.push(chr);
                    }
                    break;
                }
            }
            //
            if(ch != ')'){
                stack.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            char ch = stack.pop();
            ans.append(ch);
        }
        return ans.reverse().toString();
    }
}