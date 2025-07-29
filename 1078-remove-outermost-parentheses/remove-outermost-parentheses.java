class Solution 
{
    public String removeOuterParentheses(String s) 
    {
        Stack<Character> stack = new Stack<>();
        String result  = "";
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if(!stack.isEmpty())
                {
                    result += "(";
                }
                stack.push('(');
            }
            else
            {
                stack.pop();
                if(!stack.isEmpty())
                {
                    result += ")";
                }
            }
        }
        return result;
    }
}