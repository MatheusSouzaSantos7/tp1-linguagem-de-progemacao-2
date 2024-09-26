// Nome: Matheus Angelo de Souza Santos
// Nome: Leandro Felix Nunes
public class TestBook {
    public static void main(String[] args) {
        // Cria e aloca o array de autores
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        // Declara e aloca a instância de um book
        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);

        // Imprime o resultado do toString() do Book
        System.out.println(testeBook);
    }
}