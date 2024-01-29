package hw2;

public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("Testing class Author...");
        System.out.println("Creating object...");
        Author author = new Author("Anton", "anton@gmail.com", 'M');
        System.out.println(author);
        System.out.println("Changing email...");
        author.setEmail("sobaka@mail.ru");
        System.out.println(author);
        System.out.println("Finished.");
    }
}
