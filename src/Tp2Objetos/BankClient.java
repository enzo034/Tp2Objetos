//From exercise 3

package Tp2Objetos;

import java.util.UUID;
public class BankClient
{
    private UUID id;
    private String name;
    private char gender;

    public String getName() {
        return name;
    }

    public BankClient(String name, char gender)
    {
        this.name = name;
        this.gender = gender;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return  "Name = " + name +
                " | Gender = " + gender +
                " | ID = " + id;
    }
}
