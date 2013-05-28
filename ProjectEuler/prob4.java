public class prob4
{
    int main()
    {
        int large=0;
        for(int i=999;i>=100;i--)
        {
            for(int j=999;j>=100;j--)
            {
                if(isPalin((i*j))==true && (i*j)>large)
                {
                  large=(i*j);
                  break;
                 }
            }
        }
        return large;
    }
    boolean isPalin(int n)
    {
        String s=Integer.toString(n);
        int t=s.length();
        for(int i=0;i<=t/2;i++)
        {
            if(s.charAt(i)!=s.charAt(t-i-1))
            return false;
        }
        return true;
    }
}
