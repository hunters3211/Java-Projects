package ex35;

import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){

        String[] list = new String[0];

        NameAdder na = new NameAdder();
        while (!in.nextLine().isEmpty()){
            System.out.println("add a name");
            String add = in.nextLine();
            na.names(list,add);
        }

        Winner w = new Winner();
        String output = w.winner(list);
        System.out.printf("The winner is %s",output);
    }
}
