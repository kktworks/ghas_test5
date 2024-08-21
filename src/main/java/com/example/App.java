package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;

public class App {
    public static void main(String[] args) {
    }

    public void writeZipEntry(ZipEntry entry, File destinationDir) throws Exception {
        // BAD
        File file = new File(destinationDir, entry.getName());
        FileOutputStream fos = new FileOutputStream(file); // BAD
    }
}
