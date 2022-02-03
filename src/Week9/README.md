# CSC7081---Programming
## Files and Streams

> Week 9 focuses on files and streams

# Files

- Data stored in variables and arrays is temporary - it's lost when a local variable goes out of scope or when the program terminates. For long-term retention of data, even after the programs that create the data terminate, computers use files.

- Data maintained in files is persistent data - it exists beyond the duration of program execution.

# Files and Streams

- Java views each file as a sequential stream of bytes.

```
  0   1   2   3   4   5   6   7   8   9  ... n-1
------------------------------------------------------
|   |   |   |   |   |   |   |   |   |   |   |   | end-of-file marker
------------------------------------------------------
```

- Every operating system provides a mechanism to determine the end of a file, such as an end-of-file marker or a count of the total bytes in the file.

# Standard Input, Standard Output and Standard Error Streams

- A Java program opens a file by creating an object and associating a stream of bytes or characters with it. The object's constructor interacts with the operating system to open the file.

- Java has stream objects the enable communication to various devices...

    - System.in (normally enables a program to input bytes from the keyboard)
    - System.out (normally enables a program to output character data to the screen)
    - System.err (normally enables a program to output errors)

- All can be redirected. For example, System.in to read from a file and System.out and System.err to write to a file.

```
public static void main(String[] args) {
    System.out.println("Out to screen");
    System.err.println("An error message");
    
    int inNum;
    try {
            inNum = System.in.read();
            System.out.println("I read a : " + (char) inNum);
    } 
    catch (IOException e) {
        e.printStackTrace();
    }
}

```

# The Java.io Package

- Java programs perform file processing by using classes from package java.io. This package includes definitions for stream classes, such as FileInputStream, FileOutputStream, FileReader, FileWriter, BufferedReader and BufferedWriter.

- In addition to the java.io classes, character-based input and output can be performed with classes Scanner and Formatter.

    - Class Scanner is used extensively to input data from the keyboard - it can also read data from a file.

    - Class Formatter enables formatted data to be output to any text-based streamin a manner similar to method System.out.printf.

# Buffered reading from file

```
public static BufferReadFromFile {
    public static void main(String[] args) {

        String line;
        try {
            // create a file object
            File file = new File("Teams.txt");
            // create a file reader object relatating to the file
            FileReader filereader = new FileReader(file.getName());
            // Note - using BufferWriter is more efficent with multiple writes to file
            BufferedReader bufferReader = new BufferedReader(filereader);
            // read the contents
            line = bufferReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferReader.readLine();
            }
            // close all resources
            bufferReader.close();
            filereader.close();
            System.out.println("File End...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

# Buffered Appending (writing) to a file

```
package reading.writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) {
        try {
            String teamToAdd = "Wales";

            File file = new File("Teams.txt");

            if (!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true); // Indicates the text should be added to the end of the file. Otherwise the whole file will be overwritten.

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(teamToAdd);
            bw.close();
            System.out.println("Write complete");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
```