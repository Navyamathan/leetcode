class Solution 
{
    public int addDigits(int num) 
    {
        if(num < 10)
        {
            return num;
        }
        int value = num;
        int sum = 0;
        while(value != 0)
        {
            sum += value%10;
            value = value/10;
        }
        return addDigits(sum);
    }
}