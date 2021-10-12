package ex31;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("enter age");
        String age = in.nextLine();
        System.out.println("enter resting hr");
        String rhr = in.nextLine();

        HrRange hrr = new HrRange();
        hrr.generateRange(age,rhr);
    }
}
