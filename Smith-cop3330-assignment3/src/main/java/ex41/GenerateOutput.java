package ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class GenerateOutput {
    public void output(String[] names) throws IOException {
        int length = names.length;

        //generate mutable object containing output
        StringBuilder sb = new StringBuilder();
        //first form the top line of text
        sb.append("total of " + length + " names\n");
        //loop through the names
        for(int i =0;i<length;i++){
            sb.append(names[i]+"\n");
        }
        String output = sb.toString();

        //create new file and write to it
        FileWriter fw = new FileWriter("output/exercise41_output.txt");
        fw.write(output);
        fw.close();

    }


}
