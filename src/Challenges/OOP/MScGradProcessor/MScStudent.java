package Challenges.OOP.MScGradProcessor;

/**
 * MSc Student, Inherits Student
 */

public class MScStudent extends Student {
    
    private int programming;
    private int compfoundations;
    private int databases;
    private int webdev;
    private int software;
    private int average;
    private Classification classification;

    public MScStudent() {

    }

    public MScStudent(String studentno, String firstname, String lastname, int programming, int compfoundations, int databases, int webdev, int software) {
        super(studentno, firstname, lastname);
        try {
            setProgramming(programming);
            setCompfoundations(compfoundations);
            setDatabases(databases);
            setWebdev(webdev);
            setSoftware(software);
            calculateAverage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getProgramming() {
        return programming;
    }

    public void setProgramming(int programming) throws Exception {
        if (programming < 0 && programming > 100)
        {
            throw new Exception("The programming score is invalid.");
        }
        this.programming = programming;
    }

    public int getCompfoundations() {
        return compfoundations;
    }

    public void setCompfoundations(int compfoundations) throws Exception {
        if (compfoundations < 0 && compfoundations > 100) {
            throw new Exception("The computing foundations score is invalid.");
        }
        this.compfoundations = compfoundations;
    }

    public int getDatabases() {
        return databases;
    }

    public void setDatabases(int databases) throws Exception {
        if (databases < 0 && databases > 100) {
            throw new Exception("The databases score is invalid.");
        }
        this.databases = databases;
    }

    public int getWebdev() {
        return webdev;
    }

    public void setWebdev(int webdev) throws Exception {
        if (webdev < 0 && webdev > 100) {
            throw new Exception("The web development score is invalid.");
        }
        this.webdev = webdev;
    }

    public int getSoftware() {
        return software;
    }

    public void setSoftware(int software) throws Exception {
        if (software < 0 && software > 100) {
            throw new Exception("The software score is invalid.");
        }
        this.software = software;
    }

    /**
     * Get the Student Average
     * @return
     */
    public int getAverage() {
        return average;
    }

    /**
     * Sets the student average and classification
     */
    public void calculateAverage() {

        int total = 0;
        total += programming*2;
        total += compfoundations;
        total += databases;
        total += webdev;
        total += software;

        this.average = total / 6;

        // Set the classification
        if (average >= 70 && average <= 100) {
            this.classification = Classification.DISTINCTION;
        } else if (average >= 60 && average <= 69) {
            this.classification = Classification.COMMENDATION;
        } else if (average >= 50 && average <= 59) {
            this.classification = Classification.PASS;
        } else if (average >= 0 && average <= 49) {
            this.classification = Classification.FAIL;
        } else {
            this.classification = Classification.ERROR;
        }
    }

    /**
     * Gets the students classification
     * @return
     */
    public Classification getClassification() {
        return classification;
    }

    /**
    * Outputs all fields  to screen
    */
    public void displayStudentRecord() {
        System.out.println("_____________________________________________\n");
        System.out.println("Student no. \t: "+this.getStudentno());
        System.out.println("First name  \t: "+this.getFirstname());
        System.out.println("Last name \t: "+this.getLastname());
        System.out.println("Module results  ");
        System.out.println("Program       \t: "+this.programming);
        System.out.println("Comp Found \t: "+this.compfoundations);
        System.out.println("DBs      \t: "+this.databases);
        System.out.println("Web     \t: "+this.webdev);
        System.out.println("Software E \t: "+this.software);
        System.out.println("Average \t: "+this.getAverage());
        System.out.println("Classification \t: "+this.classification);
        System.out.println("______________________________________\n");
    }

    /**
     * Displays the student details, average and classification
     */
    public void displayStudentClassification() {
        System.out.println("_____________________________________________\n");
        System.out.println("Student no. \t: "+this.getStudentno());
        System.out.println("First name  \t: "+this.getFirstname());
        System.out.println("Last name \t: "+this.getLastname());
        System.out.println("Average \t: "+this.average);
        System.out.println("Classification \t: "+this.classification);
        System.out.println("______________________________________\n");
    }
}