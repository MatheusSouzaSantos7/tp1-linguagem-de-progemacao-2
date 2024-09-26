// Nome: Matheus Angelo de Souza Santos
// Nome: Leandro Felix Nunes
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    // Construtor
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors.clone(); // Clonamos o array para garantir a imutabilidade
        this.price = price;
        this.qty = qty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors.clone(); // Retornamos uma cópia para garantir a imutabilidade
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsStr.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorsStr.append(",");
            }
        }
        return "Book[name=" + name + ",authors={" + authorsStr + "},price=" + price + ",qty=" + qty + "]";
    }
}