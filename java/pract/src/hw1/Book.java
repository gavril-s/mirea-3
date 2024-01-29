package hw1;

public class Book {
    private float price;
    private int numberOfPages;
    private String author;

    public Book(float price, int numberOfPages, String author) {
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                '}';
    }
}
