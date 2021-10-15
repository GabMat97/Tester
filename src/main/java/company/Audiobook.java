package company;

public class Audiobook extends LibraryItem {
    private String title;
    private String genre;

    public Audiobook(String title, String genre) {
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
