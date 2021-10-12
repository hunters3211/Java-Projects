package ex27;

import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("enter first name");
        String first = in.nextLine();
        System.out.println("enter last name");
        String last = in.nextLine();
        System.out.println("enter ZIP");
        String zip = in.nextLine();
        System.out.println("enter employee ID");
        String id = in.nextLine();

        inputValidator iv = new inputValidator();
        String output = iv.validate(first,last,zip,id);

        System.out.println(output);


    }
}
