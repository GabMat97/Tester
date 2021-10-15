package company;

public class Educational extends LibraryItem {
    private String title;
    private String genre;

    public Educational(String title, String genre) {
        super();
        this.title = title;
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
