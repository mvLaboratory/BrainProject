package com.brainacad.labs.oop.serializing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.setAddress("st. blah-blah");
        employee.setName("The Blah-Blah Man");
        employee.setNumber(100);
        employee.setSSN(112432);

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\temp.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        try {
            objectOutputStream.writeObject(employee);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            objectOutputStream.close();
        }
    }
}
