package ex41;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetInput {
    public String[] readFile() throws IOException {

        String fileName = "exercise41_input.txt";
        //create buffered reader
        Scanner in = new Scanner(new File(fileName));
        //create list of strings to store names
        ArrayList<String> words = new ArrayList<String>();

        //read names until eof storing each names as a string in list
        while(in.hasNext()){
            String word = in.next();
            words.add(word);
        }


        //return array of strings unsorted
        return words.toArray(new String[0]);
    }
}
