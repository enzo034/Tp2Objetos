//From exercise 2

package Tp2Objetos;

import java.util.UUID;
public class Client {
    private UUID id;
    private String name;
    private String email;
    private double discount;

    public Client()
    {
        id = UUID.randomUUID();
        name = "x";
        email = "x@x";
        discount = 0.0;
    }
    public Client(String name, String email, double discount)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.discount = discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getDiscount() {
        return discount;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "Client's name = " + name +
                "| Email = " + email +
                "| Discount = " + discount +
                "| ID = " + id;
    }
}