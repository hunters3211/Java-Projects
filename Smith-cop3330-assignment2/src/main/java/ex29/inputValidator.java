package ex29;

public class inputValidator {

    public boolean validate(String s) {
        if (!s.matches("[0-9]+") || s.equals("0")) {
            System.out.println("invalid input");
            return false;
        }
        else{
            return true;
        }
    }
}

