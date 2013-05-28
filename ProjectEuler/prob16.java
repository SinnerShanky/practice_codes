import java.math.*;
class prob16
{
    int main(int n)
    {
        // l=Math.log(2);
        int num=1;
        for(int i=0;i<=n;i++)
        {
            System.out.println(i+": "+Math.pow(2,i)+" ::: "+sum((int)Math.pow(2,i)));
        }
        return 0;
    }
    int sum(int n)
    {
        int t=0;
        while(n!=0)
        {
            t+=n%10;
            n/=10;
        }
        return t;
    }
}