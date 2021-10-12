package ex25;

public class PasswordChecker {
    public int passwordValidator(String password) {

        int res = 1;

        if (password.length() < 8) {
            //very weak, only numbers
            if (password.matches("[0-9]+")) {
                res = 1;
            }
            // weak only letters
            if(password.matches("[a-zA-Z]*")){
                res = 2;
            }
        }
        //password >= 8 chars
        else if(password.length()>=8){
            //strong password no special chars
            if(password.matches("[a-zA-Z0-9]*")){
                res = 3;
            }
            //very strong, 8+ with special chars
            else{
                res = 4;
            }
        }
        return res;
    }
}
