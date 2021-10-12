package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

    public static void main(String args []) throws IOException {
        //pass nothing to read method
        //return array of strings containing names
        GetInput gi = new GetInput();
        //System.out.println(gi.readFile());
        String [] nameArr = gi.readFile();
        //sort the array
        Sort s = new Sort();
        String[] nameArrSorted = s.sorter(nameArr);
        //generate output
        GenerateOutput o = new GenerateOutput();
        o.output(nameArr);

    }
}
