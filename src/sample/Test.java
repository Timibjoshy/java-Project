package sample;

/**
 * Created by expert on 7/11/18.
 */
public class Test {
    public static void main(String[] args) {

        Author a = new Author(10, "chetan bagath", 3456);
        Book b = new Book(10, "intro to java", "1", a);
        b.display();
        a.display();
    }
}
