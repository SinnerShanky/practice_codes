public class prob9
{
    void main(int n)
    {
        for(int i=3;i<=n/2;i++)
        {
            for(int j=i+1;j<=n/2;j++)
            {
                for(int k=j+1;k<=n/2;k++)
                {
                    if((i+j+k)==n)
                    {
                        if(pytha(i,j,k)==true)
                        System.out.println(i+" "+j+" "+k+":"+(i*j*k));
                    }
                }
            }
        }
    }
    private boolean pytha(int a,int b,int c)
    {
        a=a*a;
        b=b*b;
        c=c*c;
        if(a+b==c || b+c==a || c+a==b)
        return true;
        else 
        return false;
    }
}
