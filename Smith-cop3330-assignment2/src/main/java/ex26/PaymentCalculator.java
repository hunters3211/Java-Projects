package ex26;

import java.util.Scanner;

//NOT WORKING
//think int division is happening somewhere but I
//can not resolve the issue

public class PaymentCalculator {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("What is your balance");
        float balance = in.nextFloat();
        System.out.println("what is the APR as a percent");
        float I = in.nextFloat()/360;
        System.out.println("what is the monthly payment");
        float payment = in.nextFloat();

        calculatePayment cp = new calculatePayment();
        int n = cp.calculateMonthsUntilPaidOff(I,balance,payment);

        System.out.printf("it will take %d months to pay off",n);


    }

}
