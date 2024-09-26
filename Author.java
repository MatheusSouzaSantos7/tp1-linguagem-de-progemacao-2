// Nomes: Matheus Angelo e Leandro Felix
public class Author {
    private String name, email;
    private char gender; // Deve conter 'm' ou 'f'

    //Contrutor
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;   
    }

    // Gettes e Setters
    public String getName(){ return name; }
    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }
    public char getGender(){return gender; }
    public String toString(){ // Overwrite
        return String.format("Author[name=%s, email=%s, gender=%s]", name, email, gender);
    }
}
