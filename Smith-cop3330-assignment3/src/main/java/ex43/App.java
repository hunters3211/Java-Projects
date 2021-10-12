package ex43;

import java.io.IOException;
import java.util.Scanner;

public class App {
    private static Scanner in = new Scanner(System.in);

    public static void main(String args[]) throws IOException {
        //get user input
        System.out.println("site name");
        String name = in.nextLine();
        System.out.println("author");
        String author = in.nextLine();
        System.out.println("folder for javascript?");
        String jsf = in.nextLine();
        System.out.println("folder for css?");
        String cssf = in.nextLine();
        //pass to method which forms the skeleton based on answers
        SkeletonInfo si = new SkeletonInfo();
        String folderVal = si.wantsFolders(jsf,cssf);
        //pass to output methods
        generateOutput3 go = new generateOutput3();
        go.makeHtml(name,author);
        go.makeFolder(folderVal);


    }
}
