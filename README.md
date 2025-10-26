# File Explorer - Java Utility

A simple command-line file utility that lists files by extension and searches for text content within files.

---

## ✨ Features
- List files in a directory filtered by extension  
- Display file information (name, size)  
- Search for text content within files  

---

> 💡 **Note:**  
> Each branch is written differently:  
> - **Branch 1:** uses regular classes  
> - **Branch 2:** uses anonymous classes  
> - **Branch 3:** uses lambda expressions  

---

## ⚙️ Compile and Run

 Usage -> java FileExplorer <directory> <extension> [searchText]

 Compile the program -> javac FileExplorer.java

 Example for Run the program -> java FileExplorer . .txt Two

 This command lists every .txt file in the current directory that includes the word "Two".


## 📦 Building an Executable JAR File
 Compile -> javac FileExplorer.java

 Create the JAR with all compiled classes -> jar cfe FileExplorer.jar FileExplorer .

 Run the JAR -> java -jar FileExplorer.jar . .txt "Two"

## 🖼️ Example Output

 File explorer started !!!!!
 Processing directory: .
 Looking for files with extension: .txt
 Found file: tst1.txt
 Size of file 397 bytes
 Text Two found status: false    
 --------------------------------
 Found file: tst2.txt
 Size of file 374 bytes
 Text Two found status: true     
 --------------------------------
 Found file: tst3.txt
 Size of file 298 bytes
 Text Two found status: false    
 --------------------------------
```bash

