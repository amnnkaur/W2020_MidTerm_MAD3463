/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        String[] words =s.split(" ");
        String rev = "";

        for (int i = words.length- 1; i >= 0; i--){

            String word = words[i];
            String reverseWord = "";

            for(int j=0; j<word.length();j++)
            {
                reverseWord =reverseWord + word.charAt(j);
            }

            rev = rev + reverseWord + " ";
        }


        return rev ;
    }


    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        String[] words1 = s.split("\\s+");

        String init = "";

        if (words1.length == 3) {

            init = words1[0].substring(0, 1).toUpperCase() + ". " +words1[1].substring(0, 1).toUpperCase() + "." + words1[2].substring(0, 1).toUpperCase()
                    + words1[2].substring(1).toLowerCase();

        } else {

            init = null;

        }

        return init;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static char mostFrequent(String s)
    {
        int charCount=256;

        int[] count = new int[charCount];

        int i;

        for (i = 0; i < s.length(); i++)

            (count[s.charAt(i)])++;

        int mostFrequent = 0;

        for (i = 0; i < charCount; i++) {

            if (count[i] > count[mostFrequent]) {

                mostFrequent = i;

            } else if (count[i] == count[mostFrequent]) {

                mostFrequent = i;

            }

        }

        return (char)mostFrequent;

    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
        int decimal =0;

        decimal=Integer.parseInt(s,2);

        return  decimal;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {

        originalString = originalString.toLowerCase();

        findString = findString.toLowerCase();

        newString = newString.toLowerCase();

        if (originalString.contains(findString)) {

            originalString = originalString.replace(findString, newString);

        }

        else {
            System.out.println("The original String does not contain new String ");
        }


        return originalString;
    }
}
