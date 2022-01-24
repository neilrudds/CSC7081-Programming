package Week16;

/**
 * Class with a contract to provide the Animal interface
 * @author neilr
 */

public class MammalInt implements Animal {

    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal travels");
    }
    
    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
