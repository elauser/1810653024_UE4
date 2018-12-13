import java.util.Date;

public class BookAufruf {
    public static void main(String[] args) {
        Book Eragon = new Book(200, new Date(13, 4, 2018, 14, 7, 54), "My Book", "1");
        System.out.println("Das Buch hat " + Eragon.getPages() + " Seiten, wurde am "+ Eragon.getReleased() + " veröffentlicht und hat den Titel " + Eragon.getTitle());
    }

}
