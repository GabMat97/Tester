package company;

public abstract class Library {
    
    private String title;
    public Library(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("The title of this book is " + title);
    }

    public String getName() {
        return title;
    }
}
