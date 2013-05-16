#CodeChef
#http://www.codechef.com/problems/TSORT

t=gets.to_i
arr=Array.new
while t!=0
  temp=gets.to_i
  arr.push(temp)
  t-=1
end
puts arr.sort!