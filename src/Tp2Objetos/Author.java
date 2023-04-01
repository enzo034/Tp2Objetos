//From exercise 1

package Tp2Objetos;
public class Author
{

    private String name;
    private String surname;
    private String email;
    private char gender;

    public Author(String name, String surname, String email, char gender)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

}