class Solution {
    public int reverse(int x) 
    {
       long y = 0;

       while(x != 0)
       {
        int temp = x%10;
        y = (y*10) + temp;
        x = x/10;
       }

       if(Integer.MIN_VALUE > y || y > Integer.MAX_VALUE -1)
       {
        return 0;
       }

       return (int)y;
    }
}