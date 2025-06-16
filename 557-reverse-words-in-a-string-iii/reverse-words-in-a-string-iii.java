class Solution 
{
    public String reverseWords(String s) 
    {
       String[] ss = s.split(" ");
       String res = "";
       for(int i=0; i<ss.length-1; i++)
       {
        res += reverse(ss[i]);
        res += " ";
       }
       res += reverse(ss[ss.length-1]);
       return res;
    }

    public String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}