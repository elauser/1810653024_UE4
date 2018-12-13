import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookAufruf {
    public static void main(String[] args) {
        Book Eragon = new Book(200, new Date(2018, 4, 13, 14, 7, 54), "My Book", "1");
        System.out.println("Das Buch hat " + Eragon.getPages() + " Seiten, wurde am "+ Eragon.getReleased() + " veröffentlicht und hat den Titel " + Eragon.getTitle());

        List<Book> Lieblingsbuecher = new ArrayList<>();
        Lieblingsbuecher.add(new Book(200, new Date(1997, 4, 2018, 14, 7, 54), "Lieblingsbücher1", "0000001-0000-00"));
        Lieblingsbuecher.add(new Book(12000, new Date(1998,2,6,14, 7, 54), "Lieblingsbücher2", "0000002-0000-00"));
        Lieblingsbuecher.add(new Book(400, new Date(1999,3,7,14, 7, 54), "Lieblingsbücher3", "00000003-0000-00"));
        Lieblingsbuecher.add(new Book(5, new Date(2000,4,8,14, 7, 54), "Lieblingsbücher4", "0000004-0000-00"));

        for (Book i : Lieblingsbuecher){
            System.out.println(i.getTitle() + " hat " + i.getPages() + " Seiten und folgende ISBN: " +i.getIsbn());
        }
        List<PaperBook> paperbook = new ArrayList<>();
        paperbook.add(new PaperBook(200, new Date(1997, 4, 2018, 14, 7, 54), "Lieblingsbücher1",  "Serie1", "Januar"));
        paperbook.add(new PaperBook(200, new Date(1997, 4, 2018, 14, 7, 54), "Lieblingsbücher1",  "Serie1", "Januar"));
        paperbook.add(new PaperBook(200, new Date(1997, 4, 2018, 14, 7, 54), "Lieblingsbücher1",  "Serie1", "Januar"));
        paperbook.add(new PaperBook(200, new Date(1997, 4, 2018, 14, 7, 54), "Lieblingsbücher1",  "Serie1", "Januar"));
        paperbook.add(new PaperBook(200, new Date(1997, 4, 2018, 14, 7, 54), "Lieblingsbücher1",  "Serie1", "Januar"));

        for(PaperBook i : paperbook)
            System.out.println(i.getTitle() + " hat " + i.getPages() + " Seiten und folgende ISBN; " + i.getIsbn() + " zusätzlich ist es im Monat " + i.getMonth() + " erschienen");
    }

}
