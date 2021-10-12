package ex32;

import java.util.Random;

public class NumberGen {
    public int getNum(int difficulty){

        Random ran = new Random();
        int n=0;

        if(difficulty==1){
            n = ran.nextInt(10);
        }
        else if(difficulty==2){
            n = ran.nextInt(100);
        }
        else{
            n = ran.nextInt(1000);
        }
        return n;
    }
}
