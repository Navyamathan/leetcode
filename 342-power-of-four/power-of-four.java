class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        if(n<=0)
        {
            return false;
        }
        return calculation(n);
    }

    public boolean calculation(int n)
    {
        if(n == 1)
        {
            return true;
        }
        if(n%4 != 0)
        {
            return false;
        }
        return calculation(n/4);
    }
}