import java.util.*;
class Consonants
{
    /*static boolean check(String inp,int n)
    {
        for(int j=0;j<inp.length()-n;j++)
            {
                for(int k=j+n;k<inp.length();k++)
                {
                    String temp=inp.substring(j,k);
                    if(count(temp)==n)
                    return true;
                }
            }
            return false;
        }*/
    static int count(String s)
    {
        int t=0;
        for(int i=0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': break;
                default: t++;
            }
        }
        return t;
    }
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int result=0;
        int n=0;
        String temp="";
        for(int i=1;i<=t;i++)
        {
            result=0;
            String inp=scan.next();
            n=scan.nextInt();
            
            for(int j=0;j<inp.length()-n;j++)
            {
                for(int k=j+n-1;k<inp.length();k++)
                {
                    temp=inp.substring(j,k+1);
                    if(check(temp)==n)
                    result++;
                }
            }
            
            System.out.println("Case #"+i+": "+result);
        }
    }


// check if ch is vowel
static boolean is_vowel(char c)
{
	boolean val=(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	return !val;
}

// returns the number of consecutive vowels from input
// returns 0 if no consecutive vowels were found, or if no vowels were found in "input"
// returns MAX of consecutive vowels. Let's say we have this word: "teestiou" -> will return 3, because the max number of consecutive vowels is 3 ("iou")
static int check(String input)
{
	int vowels = 0; // tracks the number of vowels
	int i = 0; // keeps track of input length
	int max = -1; 

	while (i < input.length())
	{
	    vowels=0;
	    int c=i;
		for(int k=i;k<input.length();k++)// loop while input[i] is vowel
		{
			if(is_vowel(input.charAt(k)))
			vowels++; 
			else{
			break;
           }// increase index to move to next char
		}

		if (vowels > max) // if found consecutive vowels
			max = vowels;
		else
			vowels = 0;
		i++;
	}
	
	return max;
}
}