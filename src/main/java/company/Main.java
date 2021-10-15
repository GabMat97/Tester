package company;

public class Main {
    public static void main (String[] args) {

        Fantasy fantasy = new Fantasy("Lord of the Rings", "Action");
        System.out.println("Title: " + fantasy.getTitle() + " and its genre is " + fantasy.getGenre());

        Action action = new Action("Die Hard", "Action");
        System.out.println("Title: " + action.getTitle() + " and its genre is " + action.getGenre());

        Biography biography = new Biography("Mein Kampf", "Biography");
        System.out.println("Title: " + biography.getTitle() + " and its genre is " + biography.getGenre());

        Children_book children_book = new Children_book("The Gruffalo", "Children book");
        System.out.println("Title: " + children_book.getTitle() + " and its genre is " + children_book.getGenre());

        Educational educational = new Educational("The Study Skills Handbook", "Educational");
        System.out.println("Title: " + educational.getTitle() + " and its genre is " + educational.getGenre());

        Documentary documentary = new Documentary("The Social Dillemma", "Documentary");
        System.out.println("Title: " + documentary.getTitle() + " and its genre is " + documentary.getGenre());

        Audiobook audiobook = new Audiobook("Audible", "Audiobook");
        System.out.println("Title: " + audiobook.getTitle() + " and its genre is " + audiobook.getGenre());

        Self_development self_development = new Self_development("The Power of Now", "Self Development");
        System.out.println("Title: " + self_development.getTitle() + " and its genre is " + self_development.getGenre());
    }
}
