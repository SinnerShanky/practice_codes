public class prob5
{
    int main()
    {
        int temp=0;
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=21;;i++)
        {
            temp=1;
            for(int j=0;j<20;j++)
            {
                if((i%a[j])!=0)
                temp=0;
            }
            if(temp==1)
            return i;
        }
        //return -1;
    }
}
