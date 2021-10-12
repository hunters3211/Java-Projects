package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class generateOutput3 {
    //make html file
    public void makeHtml(String name, String author) throws IOException {
        //make root directory
        new File("output/exercise43_output/website/awesomeco").mkdirs();

        //store html text in string
        String html1 = "<html>\n<head>\n<TITLE>\n";
        String html2 = "\n</TITLE>\n<meta name = \"author\" content = ";
        String html3 = "</head>\n</html>";
        author = "\""+author+"\">";
        String finalHtml = html1+name+html2+author+html3;

        FileWriter fw = new FileWriter("output/exercise43_output/website/awesomeco/index.html");
        fw.write(finalHtml);
        fw.close();

    }
    //make js and css folders if applicable
    public void makeFolder(String res){
        //if only javascript
        if(res.equals("a")){
            new File("output/exercise43_output/website/awesomeco/js/").mkdirs();
        }
        //if only css
        if(res.equals("b")){
            new File("output/exercise43_output/website/awesomeco/css/").mkdirs();
        }
        //if both
        if(res.equals("ab")){
            File dir1 = new File("output/exercise43_output/website/awesomeco/js/");
            File dir2 = new File("output/exercise43_output/website/awesomeco/css/");
            dir1.mkdirs();
            dir2.mkdirs();
        }
    }
}
