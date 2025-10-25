import core.implementations.SimpleFileSearcher;
import core.interfaces.FileSearch;
import core.services.FileProcessor;


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
        FileSearch searcher = new SimpleFileSearcher();
        FileProcessor processor = new FileProcessor(searcher);

        try {
            processor.processFiles(directory, extension, searchtext);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
