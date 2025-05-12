class Solution {
    public int reverse(int x) 
    {
       long y = 0;
       int min = -2147483648;
       int max = 2147483647;

       while(x != 0)
       {
        int temp = x%10;
        y = (y*10) + temp;
        x = x/10;
       }

       if(min > y || y > max)
       {
        return 0;
       }

       return (int)y;
    }
}