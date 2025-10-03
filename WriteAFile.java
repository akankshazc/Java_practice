// Chapter 16

import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.txt");

            writer.write("Hello everyone!");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
