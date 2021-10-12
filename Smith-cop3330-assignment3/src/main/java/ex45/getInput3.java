package ex45;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getInput3 {
    String[] getFile() throws IOException {
        String fileName = "exercise45_input.txt";
        //create buffered reader
        FileReader fr = new FileReader(fileName);
        BufferedReader in = new BufferedReader(fr);
        //create list of strings to store names
        List<String> lines = new ArrayList<String>();

        String line;
        //read lines until eof storing each names as a string in list
        while((line = in.readLine()) != null){
            lines.add(line);
        }

        //return array of strings
        return lines.toArray(new String[0]);
    }
}
