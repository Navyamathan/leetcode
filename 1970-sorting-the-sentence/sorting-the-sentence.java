class Solution 
{
    public String sortSentence(String s) 
    {
        String[] ss = s.split(" ");
        String[] sorted = new String[ss.length];
        for(int i=0; i<ss.length; i++)
        {
            int index = (ss[i].charAt(ss[i].length()-1) - '0') -1;
            sorted[index] = ss[i].substring(0,ss[i].length()-1);
        }
        return String.join(" ",sorted);
    }
}