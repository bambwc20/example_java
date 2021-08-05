import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.Exception;

public class Instance {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.json");
        p2.write("Hello 2.json");
        p2.close();

        // try {
        // PrintWriter p1 = new PrintWriter("result1.txt");

        // } catch (Exception e) {
        // System.out.println(e);
        // }

    }
}
