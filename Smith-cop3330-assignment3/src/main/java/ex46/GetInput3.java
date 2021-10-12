package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetInput3 {

    public String[] getf() throws FileNotFoundException {

            //create buffered reader
            //scanner instead
            String fileName = "exercise46_input.txt";
            Scanner in = new Scanner(new File(fileName));

            //create array list to store words
            ArrayList<String> words = new ArrayList<>();

            //read in words
            while(in.hasNext()){
                String word = in.next();
                words.add(word);
            }

            //return array of strings where each string is 1 word
            String[] wordArr = words.toArray(new String[0]);
            return wordArr;
        }
    }

