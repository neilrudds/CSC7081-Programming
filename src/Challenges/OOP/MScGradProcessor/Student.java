package Challenges.OOP.MScGradProcessor;

/**
 * Student Class
 */

public class Student {

    private String studentno;
    private String firstname;
    private String lastname;

    // Default Constructor
    public Student() {

    }

    /**
     * Constructor with arguments
     * @param studentno
     * @param firstname
     * @param lastname
     */
    public Student(String studentno, String firstname, String lastname) {
        try {
            setStudentno(studentno);
            setFirstname(firstname);
            setLastname(lastname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the Student number
     * @return
     */
    public String getStudentno() {
        return studentno;
    }

    /**
     * Sets the student number
     * @param studentno must be 8 characters
     * @throws Exception if number is invalid
     */
    public void setStudentno(String studentno) throws Exception {
        if (studentno.length() < 8) {
            throw new Exception("The student number is invalid");
        }
        this.studentno = studentno;
    }

    /**
     * Gets the First Name
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the First Name
     * @param firstname must be a minimum of 1 character
     * @throws Exception if First Name is invalid
     */
    public void setFirstname(String firstname) throws Exception {
        if (firstname.length() < 1) {
            throw new Exception("The firstname is invalid");
        }
        this.firstname = firstname;
    }

    /**
     * Gets the Last Name
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the Last Name
     * @param lastname must be a minimum of 1 character
     * @throws Exception if Last Name is invalid
     */
    public void setLastname(String lastname) throws Exception {
        if (lastname.length() < 1) {
            throw new Exception("The lastname is invalid");
        }
        this.lastname = lastname;
    }
}
