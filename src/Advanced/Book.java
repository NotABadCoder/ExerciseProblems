package Advanced;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + ',' + authorsToString() + ",price=" + price + ",qty=" + qty + "]";
    }

    private String authorsToString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i].toString());
            if (i < authors.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}