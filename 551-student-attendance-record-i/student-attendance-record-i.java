class Solution 
{
    public boolean checkRecord(String s) 
    {
        if(s.length() == 1)
        {
           return true;
        }
        
        int absent = 0;
        int late = 0;

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'A')
            {
                absent++;
                if(absent == 2)
                {
                    return false;
                }
            }
            else if(ch == 'L')
            {
                if(i<s.length()-1)
                {
                    if(s.charAt(i+1) != 'L')
                    {
                        late++;
                        if(late == 3)
                        {
                            return false;
                        }
                        late = 0;
                    }
                    else
                    {
                        late++;
                    }
                }
                else
                {
                    if(s.charAt(i-1) != 'L')
                    {
                        late++;
                        if(late == 3)
                        {
                            return false;
                        }
                        late = 0;
                    }
                    else
                    {
                        late++;
                    }
                }
                if(late == 3)
                {
                    return false;
                }
            }
        }
        return true;
    }
}