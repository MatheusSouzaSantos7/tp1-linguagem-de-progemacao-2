/*
- Testar construtor.
- Verificar o método toString().
- Testar o Setter
- Testar os Getters
*/
public class TestaAuthor {
    public static void main(String[] args) {
        Author author = new Author("Matheus", "matheus@gmail.com", 'm');
        System.out.println(author.toString());

        // Testando getters
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());

        //Testando Setters
        author.setEmail("leandro@gmail.com");
        System.out.println(author.getEmail());
    }    
}
