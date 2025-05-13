class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]" , "").toLowerCase();
        System.out.println(s);
        if(s.isEmpty())
        {
            return true;
        }
        int i = 0;
        boolean result = calculation(i , s);
        return result;
    }

    public boolean calculation(int i,String s)
    {
        if(i >= s.length()/2)
        {
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-1-i))
        {
            return false;
        }
        return calculation(i+1,s);
    }



    //     s = s.replaceAll("[^A-Za-z0-9]" , "").toLowerCase();
    //     int index = s.length();
    //     String rev = "";
    //     String result = calculation(index,rev,s);
    //     if(s.equals(result))
    //     {
    //         return true;
    //     }
    //     return false;
    // }
    // public String calculation(int i,String rev,String s)
    // {
    //     if(i <= 0)
    //     {
    //         return rev;
    //     }
    //     return calculation(i-1,rev+s.charAt(i-1),s);
    // }
}