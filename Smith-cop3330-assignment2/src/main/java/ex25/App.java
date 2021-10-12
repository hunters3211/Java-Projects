/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Smith
 */

package ex25;

import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("enter you password");
        String password = in.nextLine();

        PasswordChecker pc = new PasswordChecker();
        int strength = pc.passwordValidator(password);

        String output = returnStrength(strength);
        System.out.println(output);
    }

    public static String returnStrength(int strength){
        if(strength==1){
            return "very weak password";
        }
        else if(strength==2){
            return "weak password";
        }
        else if(strength==3){
            return "strong password";
        }
        else{
            return "very strong password";
        }
    }


}
