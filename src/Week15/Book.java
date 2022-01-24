package Week15;

/**
 * Enums
 * Class that has a field that consists of an enum
 * @author neilr
 */

public class Book {

    public Book(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    private String name;
    private Genre genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
