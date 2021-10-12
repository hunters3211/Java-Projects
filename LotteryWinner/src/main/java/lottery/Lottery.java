/* Name: Hunter Smith
 * Dr. Andrew Steinberg
 * COP3503 Fall 2021
 * Programming Assignment 1
 */
package lottery;

import java.util.Arrays;
import java.util.Random;

public class Lottery {

    private String ticket;
    //constructors
    public Lottery(){
        ticket = "";
    }
    public Lottery(Random rand){
        ticket = String.format("%06d",rand.nextInt(900000)+100000);
    }

    public static void main(String args[]){

        Random rand = new Random();
        rand.setSeed(0);
        Lottery[] tickets = new Lottery[100000];
        //set ticket value at each index to random 6 digit val
        for (int i =0;i<tickets.length;i++){
            tickets[i] = new Lottery(rand);
        }

        tickets = Sort(tickets);
        String randomWinningNumber = Lottery.GenerateRandomWinner(rand);
        int winningIndex = Lottery.GenerateSelectWinner(100000, rand);
    }

    public static Lottery[] Sort(Lottery[] tickets){

        //convert tickets to int array
        int[] intArr = new int[tickets.length];
        for(int i=0;i<tickets.length;i++){
            intArr[i] = Integer.parseInt(tickets[i].ticket);
        }
        //sort
        Arrays.sort(intArr);
        //convert tickets back to String array
        for(int i=0;i<tickets.length;i++){
            tickets[i].ticket = String.valueOf(intArr[i]);
        }
        //return sorted Lottery object
        return tickets;
    }

    public static String GenerateRandomWinner(Random rand){

        //generate random 6 digit winning number
        int val = rand.nextInt(900000)+100000;
        String winningVal = String.format("%06d",val);
        return winningVal;
    }

    public static int GenerateSelectWinner(int maxIndex,Random rand){

        //generate random winning index between 0 and maxIndex
        int winIndex = rand.nextInt(maxIndex);
        return winIndex;
    }

    public static Boolean Solution1(Lottery[] tickets, String test, int size){

        //linear search over the entire array
        for(int i =0; i<tickets.length;i++) {
            if (tickets[i].ticket == test) {
                return true;
            }
        }

        return false;

    }

    public static Boolean Solution2(Lottery[] tickets, int left, int right, String test){

        //binary search through array
        if(right >=left){
            int i = left + (right - left)/2;
            if(tickets[i].ticket.equals(test)){
                return true;
            }
            if(Integer.parseInt(tickets[i].ticket)>Integer.parseInt(test)){
                return Solution2(tickets,left,i-1,test);
            }
            return Solution2(tickets,i+1,right,test);
        }
        //winning ticket not found
        return false;

    }

    public String GetTicket(){
        return this.ticket;
    }
}
