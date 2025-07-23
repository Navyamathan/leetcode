class Solution {
    public String licenseKeyFormatting(String s, int k) 
    {
        s = s.toUpperCase();
        String[] temp = s.split("-");
        String string = "";
        for(int i=0; i<temp.length; i++)
        {
            string += temp[i];
        }
        if(string.length() == 0)
        {
            return string;
        }
        String result = "";
        int i = 0;
        System.out.println(string.length());
        if(string.length()%k != 0)
        {
            int remainder = string.length()%k;
            result += string.substring(0,remainder);
            result += "-";
            System.out.println(remainder);
            i = remainder;
        }
        while(true)
        {
            if(i+k <= string.length())
            {
                result += string.substring(i,i+k);
                result += "-";
                i = i+k;
            }
            else
            {
                break;
            }
        }
        result = result.substring(0,result.length()-1);
        return result;
    }
}