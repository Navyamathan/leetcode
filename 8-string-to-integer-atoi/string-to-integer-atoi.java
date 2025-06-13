class Solution 
{
    public int myAtoi(String s) 
    {
       long value = 0;
        boolean sign = false;
        boolean digit = false;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(char ch : s.toCharArray())
        {
            if(!digit)
            {
                if(ch == '-')
                {
                    digit = true;
                    sign = true;
                    continue;
                }
                else if(ch == '+')
                {
                    digit = true;
                    continue;
                }
            }
            if(Character.isDigit(ch))
            {
                digit = true;
                value = value * 10 + (ch - '0');
                if(sign && -value < min)
                {
                    return min;
                }
                else if(!sign && value > max)
                {
                    return max;
                }
            }
            else if(ch == ' ')
            {
                if(!digit)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
            else
            {
                break;
            }
        }
        if(sign)
        {
            value = -value;
        }
        return (int) value;
    }
}