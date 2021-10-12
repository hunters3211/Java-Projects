package ex42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetInput2 {
    public String[] readFile() throws IOException {

        String fileName = "exercise42_input.txt";
        //create buffered reader
        FileReader fr = new FileReader(fileName);
        BufferedReader in = new BufferedReader(fr);
        //create list of strings to store names
        List<String> names = new ArrayList<String>();

        String name;
        //read names until eof storing each names as a string in list
        while((name = in.readLine()) != null){
            names.add(name);
        }

        //return array of strings
        return names.toArray(new String[0]);
    }
}
