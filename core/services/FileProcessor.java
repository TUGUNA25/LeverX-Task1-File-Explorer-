package core.services;

import java.io.File;

import core.interfaces.FileSearch;

public class FileProcessor {
    private FileSearch searcher;
    public FileProcessor(FileSearch searcher){
        this.searcher = searcher;
    }
    
    public void processFiles(String directoryPath, String extension, String searchText){
        System.out.println("Processing directory: " + directoryPath);
        System.out.println("Looking for files with extension: " + extension);
        File directory = new File(directoryPath);
        File[] allfiles = directory.listFiles();
        if(allfiles == null){
            System.out.println("there is no files in this directory");
            return;
        }
        for(File file : allfiles){
            if (file.isFile() && file.getName().endsWith(extension)) {
                System.out.println("Found file: "+file.getName());
                System.out.println("Size of file "+file.length()+" bytes");

                if(searchText != null && !searchText.trim().isEmpty()){
                    boolean found = searcher.containText(file, searchText);
                    System.out.println("Text " +searchText + " found status: "+found);
                }
                System.out.println("--------------------------------");
            }
            
        }
    }
}
