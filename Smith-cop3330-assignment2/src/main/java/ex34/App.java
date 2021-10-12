package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String args[]){

        String[] names = new String[]{"John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"};

        System.out.println(Arrays.toString(names));
        nameRemover nr = new nameRemover();
        String[] output = nr.removeName(names);
        System.out.println(Arrays.toString(output));

    }
}
