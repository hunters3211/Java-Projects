package ex42;

import ex41.GenerateOutput;
import ex41.GetInput;

import java.io.IOException;

public class App {

    public static void main(String args[]) throws IOException {
        //pass nothing to read method
        //return array of strings containing names
        GetInput2 gi = new GetInput2();
        //System.out.println(gi.readFile());
        String [] nameArr = gi.readFile();
        //generate output
        GenerateOutput2 o = new GenerateOutput2();
        o.output(nameArr);

    }
}
