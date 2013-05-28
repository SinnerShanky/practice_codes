public class prob12
{
    long main()
    {
        for(int i=9999;;i++)
        {
            long t=numbr(i);
            if(factors(t)>500)
            return t;
        }
    }
    private long numbr(int n)
    {
        long t=((n*n)+n)/2;
        return t;
    }
    private int factors(long n)
    {
        int count=2;
        for(long i=2;i<=n/2;i++)
        {
            if(n%i==0)
            count++;
        }
        return count;
    }
}
