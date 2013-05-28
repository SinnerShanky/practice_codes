public class prob14
{
    long main()
    {
        long n=1;
        int count=1;
        for(long i=n;i<1000000;i++)
        {
            int temp=chain(i);
            if(temp>count)
            {
                count=temp;
                n=i;
            }
        }
        return n;
    }
    boolean even(long n)
    {
        if(n%2==0)
        return true;
        else
        return false;
    }
    int chain(long n)
    {
        int count=1;
        while(n!=1)
        {
            if(even(n)==true)
            n/=2;
            else
            n=(3*n)+1;
            count++;
        }
        return count;
    }
}