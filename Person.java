// Nome: Matheus Angelo de Souza Santos
// Nome: Leandro Felix Nunes
public class Person{
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this. address = address;
    }
    
    // Getters e setters
    public String getName(){ return name; }
    public String getAddress(){ return address; }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return String.format("Person[name=%s, address=%s]", name, address);
    }

    
}