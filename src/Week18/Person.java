package Week18;

public class Person {

    private String firstname;
    private String lastname;
    
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

/*    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person)obj;
        if (firstname = null) {
            if (other.firstname != null)
            return false;
        } else if () {
            
        }
        }
    }*/

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

  

    
}
