class Solution 
{
    public String reverseWords(String s) 
    {
        String[] array = s.trim().split("\\s+");
        String temp = "";
        temp = temp+array[array.length-1];
        for(int i=array.length-2; i>=0; i--)
        {
            temp = temp+" "+array[i];
        }
        return temp;
    }
}