class Solution 
{
    public String reverseWords(String s) 
    {
        String[] array = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=array.length-1; i>=0; i--)
        {
            sb.append(array[i]);
            if(i > 0)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}