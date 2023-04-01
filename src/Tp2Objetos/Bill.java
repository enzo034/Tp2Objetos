//From exercise 2

package Tp2Objetos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Bill
{

    private UUID idPurchase;
    private LocalDateTime actualDate;
    private Client client;
    private double totalAmount;
    private ItemSale[] items;

    public Bill(Client client, double totalAmount, ItemSale[] items)
    {
        this.idPurchase = UUID.randomUUID();
        this.actualDate = LocalDateTime.now();
        this.client = client;
        this.totalAmount = totalAmount;
        this.items = items;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Client getClient() {
        return client;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public UUID getIdPurchase() {
        return idPurchase;
    }

    public LocalDateTime getActualDate() { return actualDate; }

    public ItemSale[] getItems() { return items; }

    public double calculateTotalAmount()
    {
        for(ItemSale item : items)
        {
            totalAmount += item.getUnitaryPrice();
        }
        return totalAmount;
    }

    public double discountTotalAmount()
    {
        return totalAmount = ((100-client.getDiscount())*totalAmount)/100;
    }

    public void printItems()
    {
        System.out.println("\nProducts : ");
        for(ItemSale item : items)
        {
            System.out.println("Product's name = " + item.getName() +
                    " | Description = " + item.getDescription() +
                    " | Price = " + item.getUnitaryPrice() +
                    " | ID = " + item.getIdItem());
        }
    }

    public void printBill()
    {
        System.out.println("Bill[ID =  " + idPurchase + ", Date = " + actualDate + ", Amount = " + totalAmount +
                ", Amount with discount = " + discountTotalAmount());
        System.out.println("\nClient[ID = " + client.getId() + ", Name = " + client.getName() + ", Email = " + client.getEmail() +
                ", Discount = " + client.getDiscount());
        printItems();
    }

    @Override
    public String toString() {
        return  "Client's name = " + client.getName() +
                "| Total = " + totalAmount +
                "| Date = " + actualDate +
                "| ID buy = " + idPurchase;
    }
}