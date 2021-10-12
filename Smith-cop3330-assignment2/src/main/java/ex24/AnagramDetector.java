package ex24;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2){
        //return 1 for anagram 0 for no

        char[] wordArr1 = word1.toCharArray();
        char[] wordArr2 = word2.toCharArray();
        Arrays.sort(wordArr1);
        Arrays.sort(wordArr2);
        return Arrays.equals(wordArr1, wordArr2);
    }
}
