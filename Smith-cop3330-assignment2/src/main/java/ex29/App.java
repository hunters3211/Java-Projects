package ex29;

import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){

        boolean flag = false;
        inputValidator iv = new inputValidator();

        System.out.println("input value");

        String s = "";
        while(!flag){
            s = in.nextLine();
            flag = iv.validate(s);
        }

        int t = Integer.parseInt(s);
        System.out.printf("it will take %d years to double investment", 72/t);

    }

}
