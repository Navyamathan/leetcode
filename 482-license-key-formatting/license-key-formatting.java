class Solution {
    public String licenseKeyFormatting(String s, int k) 
    {
        s = s.toUpperCase();
        StringBuilder sbTemp  = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != '-')
            {
                sbTemp.append(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=sbTemp.length()-1 ; i>=0; i--)
        {
            sb.append(sbTemp.charAt(i));
            count++;
            if(count == k && i != 0)
            {
                sb.append("-");
                count = 0;
            } 
        }
        return sb.reverse().toString();
    }
}