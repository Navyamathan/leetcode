class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]" , "").toLowerCase();
        int index = s.length();
        String rev = "";
        String result = calculation(index,rev,s);
        if(s.equals(result))
        {
            return true;
        }
        return false;
    }
    public String calculation(int i,String rev,String s)
    {
        if(i <= 0)
        {
            return rev;
        }
        return calculation(i-1,rev+s.charAt(i-1),s);
    }
}