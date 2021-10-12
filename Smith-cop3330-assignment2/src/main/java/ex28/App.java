package ex28;

import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){

        int[] numArr = getInput();

        Add add = new Add();
        int output = add.adder(numArr);

        System.out.printf("sum is %d", output);
    }

    static int[] getInput(){
        int[] numArr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("enter number %d\n",i+1);
            numArr[i] = in.nextInt();
        }

        return numArr;
    }
}
