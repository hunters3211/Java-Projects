package ex31;

public class HrRange {
    public boolean generateRange(String age, String rhr){

        if (!age.matches("[0-9]+")) {
            System.out.println("invalid input");
            return false;
        }

        if (!rhr.matches("[0-9]+")) {
            System.out.println("invalid input");
            return false;
        }

        int rhrInt = Integer.parseInt(rhr);
        int ageInt = Integer.parseInt(age);

        System.out.println("intensity\trate\n");
        for(int i=55; i<100; i=i+5){
            //using the formula for "TargetHeartRate"
            //yields incorrect answers for heart rate
            int rate = (((220-ageInt)-rhrInt)*i)+rhrInt;
            System.out.printf("%d\t\t\t%d\n",i,rate);
        }
        return true;
    }


}
