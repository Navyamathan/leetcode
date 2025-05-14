class Solution 
{
    public boolean isPowerOfThree(int n) 
    {
        if(n <= 0)
        {
            return false;
        }
        boolean result = calculation(n);
        return result;
    }

    public boolean calculation(int n)
    {
        if(n == 1)
        {
            return true;
        }

        if(n%3 != 0)
        {
            return false;
        }
        
        return calculation(n/3);
    }
}