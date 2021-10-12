package ex33;

import java.util.Random;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("what is your question");
        String question = in.nextLine();
        String[] choices =new String[]{"yes","no","maybe","ask later"};

        Random ran = new Random();
        int choice = ran.nextInt(choices.length);
        System.out.println(choices[choice]);



    }
}
