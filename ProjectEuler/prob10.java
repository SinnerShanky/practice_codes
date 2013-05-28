public class prob10
{
   private boolean isPrime (long num)
  {
    boolean prime = true;
    long limit = (long)Math.sqrt(num);  
    for (long i=2;i<=limit;i++)
    {
      if (num%i==0)
      {
        prime = false;
	    break;
      }
    }
    return prime;
  }
  long main(long n)
  {
      long count=0;
      long i=0;
      if(n>2)
      count=2;
      for(i=3;i<n;i=i+2)
      {
          if(isPrime(i)==true)
          count+=i;
      }
      return count;
   }
}
