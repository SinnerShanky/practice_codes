public class prob6
{
    int main(int n)
    {
        int sub2=((n*n)+n)/2;
        sub2=sub2*sub2;
        int sub1=(n*(n+1)*((2*n)+1))/6;
        return sub2-sub1;
    }
}
