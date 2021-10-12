package ex32;

import java.util.Scanner;

//NOT WORKING
//Possibly passing a null value to an int not sure
public class App {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("enter the difficulty level 1 2 or 3");
        int level = in.nextInt();

        NumberGen ng = new NumberGen();
        int value = ng.getNum(level);
        System.out.println("I have the number");

        int guesses=0;
        GamePlay gp = new GamePlay();
        boolean flag = false;
        while(!flag){
            System.out.println("enter a guess");
            String initial = in.nextLine();
            guesses = guesses + gp.play(initial,value);
            flag = gp.flagCheck(initial,value);
        }
        System.out.printf("you guessed correctly in %d tries",guesses);
    }

}
