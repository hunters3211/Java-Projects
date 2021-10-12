package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class nameRemover {
    private static final Scanner in = new Scanner(System.in);

    public String[] removeName(String[] names){
        System.out.println("enter an employee name to remove");
        String removeName = in.nextLine();
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        list.remove(removeName);
        names = list.toArray(new String[0]);
        return names;
    }
}
