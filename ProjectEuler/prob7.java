public class prob7
{
   public boolean isPrime (long num)
  {
    boolean prime = true;
    long limit = (long) Math.sqrt ( num );  

    for ( int i = 2; i <= limit; i++ )
    {
      if ( num % i == 0 )
      {
        prime = false;
	    break;
      }
    }
    return prime;
  }
  long main(int n)
  {
      int count=0;
      long i=0;
      for(i=2;;i++)
      {
          if(isPrime(i)==true)
          count++;
          if(count==n)
          return i;
        }
    }
}
