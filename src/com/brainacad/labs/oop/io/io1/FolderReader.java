package com.brainacad.labs.oop.io.io1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FolderReader {
    public static void main(String[] args) throws IOException {
        Files.walk(Paths.get(args.length > 0 ? args[0] : "")).forEach(path -> System.out.println(path.toAbsolutePath()));
    }
}
