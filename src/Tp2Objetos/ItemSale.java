//From exercise 2

package Tp2Objetos;

import java.util.UUID;
public class ItemSale
{
    private final UUID idItem;
    private String name;
    private String description;
    private double unitaryPrice;

    public ItemSale()
    {
        idItem = UUID.randomUUID();
        this.name = "x";
        this.description = "xx";
        this.unitaryPrice = 0.0;
    }

    public ItemSale(String name, String description, double unitaryPrice)
    {
        idItem = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.unitaryPrice = unitaryPrice;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public double getUnitaryPrice() {
        return unitaryPrice;
    }
    public UUID getIdItem() {
        return idItem;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setUnitaryPrice(double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }
}