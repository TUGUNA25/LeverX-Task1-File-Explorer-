package core.implementations;
import core.interfaces.FileSearch;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class SimpleFileSearcher implements FileSearch  {

    @Override
    public boolean containText(File file, String text) {
        try{
            String content = Files.readString(file.toPath());
            boolean found = content.contains(text);
            return found;
        }
        catch(IOException e){
            System.out.println("Error reading file " + file.getName() + ": " + e.getMessage());
            return false;
        }
    }
    
}
