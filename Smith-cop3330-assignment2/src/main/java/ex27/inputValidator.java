package ex27;

public class inputValidator {
    public String validate(String first, String last, String zip, String id){

        String finalMessage = "";
        boolean flag = true;

        if(first.length()<=2){
            flag = false;
            finalMessage=finalMessage.concat("first name must be filled in\n");
        }
        if(last.length()<=2){
            flag = false;
            finalMessage=finalMessage.concat("last name must be filled in\n");
        }
        if(!id.matches("\\w{2}-\\d{4}")){
            flag = false;
            finalMessage=finalMessage.concat("id must be in correct format\n");
        }
        if(!zip.matches("[0-9]+")){
            flag = false;
            finalMessage=finalMessage.concat("zip must contain only numbers");
        }
        if(flag){
            finalMessage=finalMessage.concat("no errors found");
        }

        return finalMessage;
    }
}
