package Challenges.OOP.MScGradProcessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExamResultProcessor {

    public static final String RESOURCES_PATH = "Resources/";
    
    public static void main(String[] args) {

        // Store the students in this array list
        ArrayList<MScStudent> mscStudents = new ArrayList<MScStudent>();

        // Import from file
        getMScStudentResults("ModuleScoresMSc.csv", mscStudents);

        // Display
        displayStudentRecords(mscStudents);
        displayStudentClassifications(mscStudents);

        // Export to graduation list
        saveGraduatesToFile(mscStudents, "ListForGraduation.txt");
    }

    /**
     * Display student records
     * @param students ArrayList to display
     */
    public static void displayStudentRecords(ArrayList<MScStudent> students) {

        if (students.size() > 0) {
            for (MScStudent student : students) {
                student.displayStudentRecord();
            }
        } else {
            System.out.println("There are no records to display.");
        }

    }

    /**
     * Display student classifications
     * @param students ArrayList to display
     */
    public static void displayStudentClassifications(ArrayList<MScStudent> students) {

        if (students.size() > 0) {
            for (MScStudent student : students) {
                student.displayStudentClassification();
            }
        } else {
            System.out.println("There are no records to display.");
        }

    }

    /**
     * Get the student records and results from a CSV file to the MScStudent object
     * @param fn Filename to read from
     * @param students ArrayList is passed by reference
     */
    public static void getMScStudentResults(String fn, ArrayList<MScStudent> students) {

        try {

            File file = new File(RESOURCES_PATH + fn);

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String row;

            // Read the header
            br.readLine();

            // Read each student row and add to ArrayList
            while((row = br.readLine()) != null && row.length() > 0) {
                // Split the row
                String[] cells = row.split(",");
                students.add(new MScStudent(cells[0], cells[1], cells[2],
                                            Integer.valueOf(cells[3]), Integer.valueOf(cells[4]),
                                            Integer.valueOf(cells[5]), Integer.valueOf(cells[6]),
                                            Integer.valueOf(cells[7])));
            }
            fr.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error has occured when importing the file data");
        }
    }

    /**
     * Save graduates to file
     * @param students ArrayList to save
     * @param fn File name to save to
     */
    public static void saveGraduatesToFile(ArrayList<MScStudent> students, String fn) {

        try {

            File file = new File(RESOURCES_PATH + fn);

            // Do we have records to process
            if (students.size() == 0 || students == null) {
                System.out.println("There are no records to save...exiting...");
                return;
            }

            // Create the file if it doesn't exit
            if (!file.exists() || file.isDirectory()) {
                System.out.print("File does not exist, creating...");
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);

            // Loop the records and write to the file
            for (MScStudent student : students) {
                StringBuilder sb = new StringBuilder();
                sb.append(student.getStudentno());
                sb.append(",");
                sb.append(student.getFirstname());
                sb.append(",");
                sb.append(student.getLastname());
                sb.append(",");
                //sb.append(student.getClassification().toString());
                sb.append("\n");
                bw.write(sb.toString());
            }
            fw.close();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Opps, somethings gone wrong!");
        }
    }
}