package company;
public abstract class LibraryItem {

    ////////////////Attributes/////////////////
    private String genre;
    private String title;
//    private Integer pages;

    ////////////////Constructor////////////////
    public LibraryItem(String title, String genre) {
        this.title = title;
        this.genre = genre;

    }



    ////////////////Methods///////////////
    public void book(){
        System.out.println("I am a book");
    }

    public LibraryItem() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
