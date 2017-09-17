import java.util.Arrays;
class Anagram
{ 
	static int flag;
    public static void mAnagram(String str1, String str2)
    {
       	char [] a = str1.toCharArray();
        char [] b = str2.toCharArray();

        int l1,l2;
		l1=a.length;
		l2=b.length;

        if(l1 != l2) 
		{
			flag=1;
			return; 
        }
	    Arrays.sort(a);
	    Arrays.sort(b);
		
        for (int i = 0; i < l1; i++) 
 	    {
			System.out.println("inside for loop");
			if(a[i]!=b[i])
			{
				flag=1;
				return;
			}
	    }
    }
    public static void main(String [] args)
	{
        String mString1 = args[0];
        String mString2 = args[1];
		mAnagram(mString1.toLowerCase(), mString2.toLowerCase());
		if(flag == 1)
			System.out.println("Not Anagram");
		else
			System.out.println("Anagram");
    }
 }

      
