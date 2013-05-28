
/**
 * Write a description of class prob1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prob1
{
    
     int main()
     {
         int t=0;
         for(int i=3;i<1000;i++)
         {
             if(i%3==0 || i%5==0)
             t+=i;
         }
         return t;
        }
}
