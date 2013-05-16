#codechef
#http://www.codechef.com/problems/FCTRL

t=gets().to_i
while t!=0 
  n=gets.to_i
  res=0
  temp=n
  add=(temp/5).to_i
  count=2
  while add!=0
    res+=add
    add=(temp/5**count).to_i
    count+=1
  end
  puts(res)
  t-=1
end