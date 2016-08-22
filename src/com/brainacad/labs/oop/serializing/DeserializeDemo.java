package com.brainacad.labs.oop.serializing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\temp.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            objectInputStream.close();
        }
    }
}
