package Week15;

/**
 * Enums
 * @author neilr
 */

public class Library {
    
    public static void main(String[] args) {
        
        Book b1 = new Book("Catch 22", Genre.COMEDY);
        Book b2 = new Book("Mockingbird", Genre.THRILLER);

        Book[] books = {b1, b2};

        for (Book b : books) {
            if (b.getGenre() == Genre.COMEDY) {
                System.out.println("Found a funny book");
            }
        }

    }

}