#codechef
#http://www.codechef.com/problems/A6

t=gets().to_i
while t!=0 
  n=gets.to_i
  res=1
  while n!=1
    res*=n 
    n-=1
  end
  puts(res)
  t-=1
end