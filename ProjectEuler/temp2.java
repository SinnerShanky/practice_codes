
/**
 * Write a description of class temp2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class temp2
{
   void main(int n) throws IOException
   {
       BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
       String s=ob.readLine();
       String s1=ob.readLine();
       int a[]=new int[n];
       int b[]=new int[n];
       StringTokenizer st=new StringTokenizer(s);
       StringTokenizer st1=new StringTokenizer(s1);
       for(int i=0;i<n;i++)
       {
            a[i]=Integer.parseInt(st.nextToken());
            b[i]=Integer.parseInt(st1.nextToken());
       }
       Arrays.sort(a);
       Arrays.sort (b);
       int result=0;
       int tem=0;
       for(int i=0;i<n;i++)
       {
           tem=a[i]*b[n-(i+1)];
           result+=tem;
        }
           System.out.println(result);
    }
           
}
