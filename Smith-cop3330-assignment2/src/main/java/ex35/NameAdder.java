package ex35;

import java.util.Arrays;
import java.util.Scanner;

public class NameAdder {

    public String[] names(String[] list, String add){
        list = Arrays.copyOf(list,list.length+1);
        return list;
    }
}
