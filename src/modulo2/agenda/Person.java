package modulo2.agenda;
import java.util.Objects;

public class Person {
    
    private String idPerson;
    private String name;
    private String email;
    private String phone;

    
    public Person(String idPerson, String name, String email, String phone) {
        super();
        this.idPerson = idPerson;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    
    public Person() {
        super();
    }

   
    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(idPerson, person.idPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson);
    }

    
    @Override
    public String toString() {
        return "\n-------------\n" +
                "idPerson: " + idPerson + "\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "-------------";
    }
}