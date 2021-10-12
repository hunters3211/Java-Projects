package ex42;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateOutput2 {
    public void output(String[] names) throws IOException {
        int length = names.length;

        //generate mutable object containing output
        StringBuilder sb = new StringBuilder();
        //first form the top line of text
        sb.append("last\t\t" + "first\t\t" + " salary\n");
        //loop through the names and salaries
        for(int i =0;i<length;i++){
            sb.append(names[i]+"\n");
        }
        //replace commas with tabs
        String output = sb.toString().replace(",","\t\t");
        //create new file and write to it
        FileWriter fw = new FileWriter("output/exercise42_output.txt");
        fw.write(output);
        fw.close();

    }
}
