package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;

public class App {
    public static void main(String[] args) {
        final String ACCESS_KEY = "AKIAVI4WSBYRED46IP27";
        final String SECRET_KEY = "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";
    }

    public void writeZipEntry(ZipEntry entry, File destinationDir) throws Exception {
        // BAD
        File file = new File(destinationDir, entry.getName());
        FileOutputStream fos = new FileOutputStream(file); // BAD
    }
}
