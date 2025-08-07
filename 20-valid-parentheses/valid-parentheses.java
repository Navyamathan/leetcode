class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else
            {
                if(!stack.empty())
                {
                    char temp = stack.pop();
                if(ch == '}' && temp != '{')
                {
                    return false;
                }
                else if(ch == ']' && temp != '[')
                {
                    return false;
                }
                else if(ch == ')' && temp != '(')
                {
                    return false;
                }
                }
                else
                {
                    return false;
                }
            }
        }
        if(stack.empty())
        {
            return true;
        }
        return false;
    }
}