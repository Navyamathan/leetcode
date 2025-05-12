class Solution {
    public boolean isPalindrome(int x) {
        int val = x;
        if(x < 0)
        {
            return false;
        }
        int rev = 0;
        while(x > 0)
        {
            int temp = x%10;
            rev = (rev*10) + temp;
            x = x/10;
        }
        if(val == rev)
        {
            return true;
        }
        return false;
    }
}