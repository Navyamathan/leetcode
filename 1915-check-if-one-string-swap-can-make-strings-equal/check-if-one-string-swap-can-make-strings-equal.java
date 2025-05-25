class Solution 
{
    public boolean areAlmostEqual(String s1, String s2) 
    {
        if(s1.equals(s2))
        {
            return true;
        }
        int change1 = -1;
        int change2 = -1;
        for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                if(change1 != -1)
                {
                    change2 = i;
                }
                else
                {
                    change1 = i;
                }
            }
        }
        if(change1 != -1 && change2 != -1)
        {
            String temp = s2.substring(0,change1)+s2.charAt(change2);
            temp = temp+s2.substring(change1+1,change2)+s2.charAt(change1)+s2.substring(change2+1);
            System.out.println(temp);
            if(s1.equals(temp))
            {
                return true;
            }
        }
        return false;
    }
}