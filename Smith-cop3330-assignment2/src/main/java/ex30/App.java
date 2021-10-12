package ex30;

public class App {
    public static void main(String args[]){

        TableGenerator tg = new TableGenerator();
        int i =0;
        int j =0;

        for (i=1; i<=12; i++)
        {
            for (j=1; j<=12; j++)
                tg.generateVal(i,j);
        }

    }
}
