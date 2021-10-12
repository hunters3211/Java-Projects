package ex46;

import java.io.IOException;

public class App {
    public static void main(String args[]) throws IOException {

        //get input
        GetInput3 gi = new GetInput3();
        String[] words = gi.getf();
        //get output as string arr
        GenOutput go = new GenOutput();
        String output = go.getFrequency(words);
        //print output
        System.out.println(output);

    }
}
