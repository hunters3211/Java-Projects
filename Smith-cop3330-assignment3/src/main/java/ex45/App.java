package ex45;

import java.io.IOException;
import java.util.Scanner;

public class App {
    private static Scanner in = new Scanner(System.in);
    public static void main(String args[]) throws IOException {
        //get output file name
        System.out.println("enter file name");
        String fileName = in.nextLine();

        //read file
        getInput3 gi = new getInput3();
        String[] text = gi.getFile();

        //pass to generate output and create file
        generateOutput4 go = new generateOutput4();
        go.makeFile(fileName,text);


    }
}
