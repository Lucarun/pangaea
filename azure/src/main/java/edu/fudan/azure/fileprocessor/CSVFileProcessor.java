package edu.fudan.azure.fileprocessor;

public class CSVFileProcessor implements FileProcessor {
    @Override
    public void processFile(String filename) {
        System.out.println("Processing CSV file: " + filename);
    }
}