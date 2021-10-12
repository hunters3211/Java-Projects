package ex24;

import java.util.Scanner;

public class Solution {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("Enter two strings to see if they are anagrams");

        String word1 = in.nextLine();
        String word2 = in.nextLine();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1,word2);

        String output = generateOutput(result);
        System.out.println(output);

    }

    public static String generateOutput(boolean result){
        if(result){
            return "is anagram";
        }
        else{
            return "is not anagram";
        }
    }


}