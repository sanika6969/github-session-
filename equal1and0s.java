public class equal1and0s {
    public static void main(String[] args) {
        String s="01001101";
        System.out.println(BinStr(s));
    }

    static int BinStr(String s)
    {
        int x=0,y=0,c=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                x++;
            }

            else
            {
                y++;

            }

            if(x==y)
            {
                c++;

            }
            
        }
        if(x!=y)
        {
            return -1;
        }
        return c;
    }
    
}