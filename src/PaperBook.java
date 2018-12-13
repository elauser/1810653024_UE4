import java.util.Date;

public class PaperBook extends Book {
    String series;
    String month;
    static String isbn = "00000-000000-0000";

    public PaperBook(int pages, Date released, String title, String series, String month) {
        super(pages, released, title, isbn);
        this.series = series;
        this.month = month;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
