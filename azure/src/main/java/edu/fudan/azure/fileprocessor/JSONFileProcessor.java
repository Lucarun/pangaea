package edu.fudan.azure.fileprocessor;

public class JSONFileProcessor implements FileProcessor {
    @Override
    public void processFile(String filename) {
        System.out.println("Processing JSON file: " + filename);
    }
}