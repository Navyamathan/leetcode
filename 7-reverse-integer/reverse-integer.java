class Solution {
    public int reverse(int x) 
    {
       long y = 0;
       int min = Integer.MIN_VALUE;
       int max = Integer.MAX_VALUE -1;

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