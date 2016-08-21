package com.brainacad.labs.oop.io.io3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileCopy {
    public static void main(String[] args) {
        if (args.length < 2)
            return;

        FileOutputStream out;

        try (FileInputStream input = new FileInputStream(args[0]); FileOutputStream output = new FileOutputStream(args[1])) {
            while (input.available() > 0) {
                output.write(input.read());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
