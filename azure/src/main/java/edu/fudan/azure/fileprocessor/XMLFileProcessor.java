package edu.fudan.azure.fileprocessor;

public class XMLFileProcessor implements FileProcessor {
    @Override
    public void processFile(String filename) {
        System.out.println("Processing XML file: " + filename);
    }
}