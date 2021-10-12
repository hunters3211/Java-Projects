package ex35;

import java.util.Random;

public class Winner {
    public String winner(String[] list){
        Random ran = new Random();
        int choice = ran.nextInt(list.length);
        return list[choice];

    }
}
