package ex45;

import java.io.FileWriter;
import java.io.IOException;

public class generateOutput4 {
    void makeFile(String name,String[] text) throws IOException {

        StringBuilder sb = new StringBuilder();
        //loop through the lines
        for(int i =0;i<text.length;i++){
            sb.append(text[i]+"\n");
        }
        //replace utilize with use
        String output = sb.toString().replace("utilize","use");
        //create new file and write to it
        FileWriter fw = new FileWriter("output/"+name);
        fw.write(output);
        fw.close();
    }
}
