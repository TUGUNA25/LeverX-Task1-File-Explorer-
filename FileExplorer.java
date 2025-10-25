import core.interfaces.FileSearch;
import core.services.FileProcessor;
import java.io.File;

public class FileExplorer {
    public static void main(String[] args){
        System.out.println("File explorer started !!!!!");
        if(args.length <2 ){
            System.out.println("we need correct information");
            System.out.println("Usage: java FileExplorer <directory> <extension> [searchText]");
            System.out.println("Example: java FileExplorer C:\\myfolder .txt hello");
            return;
        }

        String directory = args[0];
        String extension = args[1];
        String searchtext = (args.length > 2) ? args[2] : null; 
        //LAMBDA EXPRESSION instead of anonymous class
        FileSearch searcher = (file, searchText) -> {
            try {
                String content = new String(java.nio.file.Files.readAllBytes(file.toPath()));
                return content.contains(searchText);
            } catch (Exception e) {
                System.out.println("Error reading file: " + file.getName());
                return false;
            }
        };
        FileProcessor processor = new FileProcessor(searcher);

        try {
            processor.processFiles(directory, extension, searchtext);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
