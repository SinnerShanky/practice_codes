public class prob2
{
    int main()
    {
        int tot=0,temp;
        loop1:
        for(int i=1;;i++)
        {
            temp=fibo(i);
            if(temp>=4000000)
            break loop1;
            if(temp%2==0)
            tot+=temp;
        }
        return tot;
    }
    int fibo(int n)
    {
        if(n<=1)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
}
