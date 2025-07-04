class Solution 
{
    public int romanToInt(String s) 
    {
        int sum = 0;
        int prev = 0; 
        for(int i=s.length()-1; i>= 0; i--)
        {
            int current = romanValue(s.charAt(i));
            if(current < prev)
            {
                sum -= current;
            }
            else
            {
                sum += current;
            }
            prev = current;
        }
        return sum;
    }

    public int romanValue(char ch)
    {
        switch(ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}