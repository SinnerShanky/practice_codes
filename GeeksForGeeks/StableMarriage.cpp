#include<iostream>
using namespace std;
#define N 4

bool isBetter(int *a,int cm,int m)
{
    for(int i=0;i<N;i++)
    {
        if(a[i]==m)
        return true;
        if(a[i]==cm)
        return false;
    }
}
void stable(int data[2*N][N])
{
    int wresult[N];
    bool found[N];
    int free=N;
    
    for(int i=0;i<N;found[i]=false,wresult[i]=-1,i++);
    
    while(free>0)
    {
        int i=0;
        for (i=0;i<N;i++)
        if(found[i]==false)
        break;
        
        for(int j=0;j<N && found[i]==false;j++)
        {
            int w=data[i][j];
            if(wresult[w-N]==-1)
            {
                wresult[w-N]=i;
                found[i]=true;
                free--;
            }
            else
            {
                if(isBetter(data[w],wresult[w-N],i)==true)
                {
                    found[(wresult[w-N])]=false;
                    found[i]=true;
                    wresult[w-N]=i;
                }
            }
        }
    }
    cout << "Woman   Man" << endl;
    for (int i = 0; i < N; i++)
       cout << " " << i+N << "\t" << wPartner[i] << endl;
}
