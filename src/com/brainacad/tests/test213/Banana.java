package com.brainacad.tests.test213;

import java.io.*;

class Food {
    int good = 3;
}

class Fruit extends Food  implements Serializable {
    int juice = 5;
}

public class Banana extends Fruit {
    int yellow = 4;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Banana b = new Banana();
        Banana b2 = new Banana();
        b.serializeBanana(b); // assume correct serialization
        b2 = b.deserializeBanana(); // assume correct
        System.out.println("restore " + b2.yellow + b2.juice + b2.good);
    }

    public void serializeBanana(Banana banana) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(banana);
    }

    public Banana deserializeBanana() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("data.txt");
        ObjectInputStream is = new ObjectInputStream(fis);
        return (Banana) is.readObject();
    }
}