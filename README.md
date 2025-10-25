File Explorer - Java Utility
A simple command-line file utility that lists files by extension and searches for text content within files.
Features
List files in a directory filtered by extension

Display file information (name, size)

Search for text content within files

!!!
Each branch is written differently: in the first one we simply use classes, in the second case we use anonymous classes, 
and in the third case we use lambda expressions
!!!

for the compile and run we can use this commands
//
javac FileExplorer.java
java FileExplorer . .txt Two
//  
Usage: java FileExplorer <directory> <extension> [searchText]
Example: java FileExplorer . .txt Two // which gives us every file in currecnt directory which includes word "Two"

for Building an Executable JAR File
//
javac FileExplorer.java
jar cfe FileExplorer.jar FileExplorer -C out .
java -jar FileExplorer.jar . .txt "search text"
