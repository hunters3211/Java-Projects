package ex43;

public class SkeletonInfo {
    public String wantsFolders(String js,String css){
        //return "a" if user wants js file, "b" for css
        //"ab" for both
        String retString = "";

        if(js.equals("y")){
            retString = retString+"a";
        }
        if(css.equals("y")){
            retString = retString+"b";
        }
        return retString;
    }
}
