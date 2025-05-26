class Solution 
{
    public String sortSentence(String s) 
    {
        HashMap<Integer,String> map = new HashMap<>();
        String[] ss = s.split(" ");
        for(int i=0; i<ss.length; i++)
        {
            int index = ss[i].charAt(ss[i].length()-1) - '0';
            String temp = ss[i].substring(0,ss[i].length()-1);
            map.put(index,temp);
        }
    String result = map.get(1);
    for(int i=2; i<=ss.length; i++)
    {
        result += " "+map.get(i);
    }
    return result;
    }
}