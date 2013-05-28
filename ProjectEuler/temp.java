
/**
 * Write a description of class temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class temp
{
   void main(double n)
   {
       double a=(3+Math.sqrt(5));
       for(int i=2;i<=n;i++)
       {
           double t=Math.pow(a,i);
           t=Math.floor(t);
       String s=Double.toString(t);
       System.out.println(i+": "+(long)t);
    }
    }
}
