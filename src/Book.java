import java.util.Date;

public class Book {
    int pages;
    Date released;
    String title;
    String isbn;

    public Book(int pages, Date released, String title, String isbn) {
        this.pages = pages;
        this.released = released;
        this.title = title;
        this.isbn = isbn;
    }


    public int getPages() {
        return pages;
    }

    public Date getReleased() {
        return released;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
