package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {

    private String tittle;
    private int year;
    private List<String> authors;

    public Book(String tittle, int year, String... authors) {
        setTittle(tittle);
        setYear(year);
        setAuthors(authors);
    }

    private void setTittle(String tittle) {
        this.tittle = tittle;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    public String getTittle() {
        return tittle;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Book book) {
        if (this.getTittle().compareTo(book.getTittle()) == 0) {
            if (this.getYear() > book.getYear()) {
                return 1;
            } else if (this.getYear() < book.getYear()) {
                return -1;
            }
            return 0;
        } else {
            return this.getTittle().compareTo(book.getTittle());
        }
    }
}
