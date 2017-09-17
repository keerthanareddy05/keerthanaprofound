/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/lib/StringFunctions.java
 *  Execution:    java -cp bin com/bridgelabz/lib/StringFunctions
 *  
 *  Purpose:String Functions like Anagram and palindrome
 *
 *  @author  keerthana Reddy
 *  @version 1.0
 *  @since   21-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.lib;

class StringFunctions{

    static String isAnagram_Msg = "String are Anagram";

    static String isNotAnagram_Msg = "String are not Anagram";

    static String isPalindrome_Msg = "String is Palindrome";

    static  String isNotPalindrome_Msg = "String is Not Palindrome";

    static char[] stringArray(String str){
        int length = str.length();
        char[] mString = new char[length];
        for(int i =0; i < length; i++){
            mString[i] = str.charAt(i);
        }
        return mString;
    }

    static boolean isAnagram(String str1, String str2){

        

       	a[]=str1.toCharArray();
        b[]=str2.toCharArray();
        int lengthFirst,lengthSecond,flag=0;
	l1=a[].length;
	l2=b[].length;
    

        if(lengthFirst !== lengthSecond) {
		{
		System.out.println("Not anagram");
                }
		else{
		Arrays.Sort(a);
		Arrays.Sort(b);

            for (int i = 0; i < lengthFirst; i++) {

                for (int j = 0; j < lengthFirst; j++) {


                    if (a[i] == a[j]) {

                        flag=1;
                        break;
                    }
			else{
			flag=0;
                }
            }
        }
        return mAnagram;
    }

    static boolean isPalindrome(String str1){
        boolean mPalindrome = false;

        int length1 = str1.length();

        for(int i = 0, j = length1 - 1; i < j; i++, j--){

            if(str1.charAt(i) == str1.charAt(j)){

                mPalindrome = true;
                break;
            }
        }
        return mPalindrome;
    }

    static void isEqual(String str1, String str2){
        char lengthStringFirst[] = stringArray(str1);
        char lengthStringSecond[] = stringArray(str2);

        if(lengthStringFirst.length == lengthStringSecond.length)
            System.out.println("Two String array are equal");
        else
            System.out.println("Two String array are not equal");
    }

    public static void main(String args[]){

        String mString1 = args[0];
        String mString2 = args[1];
	System.out.println("Anagram");

      

        boolean mPalindrome = isPalindrome(mString1);

        if (mPalindrome == true)
            System.out.println(isPalindrome_Msg);
        else
            System.out.println(isNotPalindrome_Msg);
        isEqual(mString1,mString2);
          
        char[] name = stringArray(mString1);
        for(int i = 0; i < name.length; i++)
             System.out.println(name[i]);
    }
}

                
