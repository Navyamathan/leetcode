class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        String [] strings = s.trim().split("\\s+");
        return strings[strings.length-1].length();
    }
}