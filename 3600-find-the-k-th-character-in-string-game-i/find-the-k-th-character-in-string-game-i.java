class Solution 
{
    public char kthCharacter(int k) 
    {
        char ch = 'a';
        String string = "a";
        String s = calculation(string,k);
        char result = s.charAt(k-1);
        return result;
    }

    public String calculation(String string, int k)
    {
        if(string.length() >= k)
        {
            return string;
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