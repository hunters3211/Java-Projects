package ex46;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GenOutput {
        String getFrequency(String [] words) {

            //keep track of count for each word
            int[] ct = new int[words.length];
            //word should not be counted twice, use negative val as placeholder
            //since word frequency can't be negative
            int check = -69;

            //loop through all words and increment word count as needed
            for(int i =0;i<words.length;i++){
                int count = 1;
                //compare current word to rest of words
                for(int j=i+1;j<words.length;j++){
                    //increment count if same word is found
                    //set index as checked
                    if(words[i].equals(words[j])){
                        count++;
                        ct[j]=check;
                    }
                }
                if(ct[i]!=check){
                    ct[i]=count;
                }
        }
            //use string builder to append words and word count
            StringBuilder sb = new StringBuilder();

            //convert word count to * before append
            for(int i=0;i<ct.length;i++){
                if(ct[i]!=check){
                    String stars="";
                    for(int j=0;j<ct[i];j++){
                        stars = stars+"*";
                    }
                    sb.append(words[i]+" "+stars+"\n");
                }
            }

            //return output string
            return sb.toString();
    }
}
