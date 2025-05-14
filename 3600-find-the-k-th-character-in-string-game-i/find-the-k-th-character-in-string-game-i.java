class Solution 
{
    public char kthCharacter(int k) 
    {
        char ch = 'a';
        String string = "a";
        return calculation(string,k);
    }

    public char calculation(String string, int k)
    {
        if(string.length() >= k)
        {
            return string.charAt(k-1);
        }
        int l = string.length();
        for(int i=0; i<l; i++)
        {
            char temp = string.charAt(i);
            ++temp;
            string = string+temp;
        }
        return calculation(string,k);
    }
}