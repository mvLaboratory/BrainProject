package com.brainacad.tests.test213;

import java.io.*;

public class Foo implements Serializable {
    public int x, y;
    public Foo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    private void writeObject(ObjectOutputStream s)
            throws IOException {
        s.writeInt(x);
        s.writeInt(y);
    }
    private void readObject(ObjectInputStream s)
            throws IOException, ClassNotFoundException {
        s.defaultReadObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream("data.txt");
        ObjectInputStream is = new ObjectInputStream(fis);

        Foo foo = new Foo(10, 15);
        foo.writeObject(os);

        foo.readObject(is);

    }
}


