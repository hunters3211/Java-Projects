package ex32;

public class GamePlay {
    public int play(String guess,int val){

        int guessCt=0;
        if (!guess.matches("[0-9]+")) {
            guessCt++;
            return guessCt;
        }

        int guessInt = Integer.parseInt(guess);

        if(guessInt==val){
            guessCt++;
            return guessCt;
        }
        else{
            if(guessInt<val){
                System.out.println("too low guess again");
            }
            else{
                System.out.println("too high guess again");
            }
            guessCt++;
            return guessCt;
        }


    }
    public boolean flagCheck(String guess,int val){
        int guessInt = Integer.parseInt(guess);

        if(guessInt==val){
            return true;
        }
        else{
            return false;
        }
    }
}
