package com.brainacad.tests.test213;

import java.io.*;

class Base {
    int code = 99;
    Base() {
        code = 77;
    }
}
public class Derived extends Base implements Serializable {
    public static void main(String[] args) {
        Derived derived1 = new Derived();
        derived1.code = 88;
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(derived1);
            os.close();
            FileInputStream fis = new FileInputStream("data.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            Derived derived2 = (Derived) is.readObject();
            System.out.print(derived2.code);
            is.close();
        } catch (Exception x) {
        }
    }
}
