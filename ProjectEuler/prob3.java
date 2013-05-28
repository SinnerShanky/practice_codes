class prob3
{
    long main(String s)
    {
        long n=Long.parseLong(s);
        long large=2;
            for ( int i = 6857; i <= n/2; i=i+2 )
            {
                if(isPrime(i)==true && (n%i)==0)
                large=i;
            }
            return large;
    }
    
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
}