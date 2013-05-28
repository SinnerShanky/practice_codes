public class prob8
{
    int main(String s)
    {
        int lgst=1;
        int t=s.length();
        for(int i=0;i<=t-5;i++)
        {
            String sub=s.substring(i,i+5);
            int fin=finder(sub);
            if(fin>lgst)
            lgst=fin;
        }
        return lgst;
    }
    private int finder(String s)
    {
        int n=Integer.parseInt(s);
        int t=1;
        while(n!=0)
        {
            int a=n%10;
            t*=a;
            n/=10;
        }
        return t;
    }
}
