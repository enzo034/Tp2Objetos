import Tp2Objetos.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("===========TESTS============");

        System.out.println("\n==== Exercise 1 ==== \n");
        Author jBloch = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(jBloch);

        Author[] authors = new Author[2];
        authors[0] = jBloch;

        Book eJava = new Book("Effective Java", 500.0, 150, authors);
        System.out.println(eJava);

        eJava.setPrice(500.0);
        eJava.setStock(eJava.getStock() + 50);

        Author pPerez = new Author("Pedro", "Perez", "pedro@email.com", 'M');
        authors[1] = pPerez;

        Book pjJava = new Book("Effective Java 2", 600, 100, authors);

        System.out.println(pjJava.printMsj());

        System.out.println("\n==== Exercise 2 ==== \n");

        Client client1 = new Client("Pedro Sanchez", "pedro@gmail.com", 20.0);

        ItemSale water = new ItemSale("Water", "Mineral water", 100);
        ItemSale potato = new ItemSale("Potato", "Natural potato", 80);
        ItemSale gratedCoconut = new ItemSale("Grated coconut", "100gr of Grated coconut", 180);

        ItemSale[] items = new ItemSale[3];
        items[0] = water;
        items[1] = potato;
        items[2] = gratedCoconut;

        Bill bill1 = new Bill(client1, 0.0, items);
        bill1.setTotalAmount(bill1.calculateTotalAmount());

        bill1.printBill();

        System.out.println("\n==== Exercise 2 ==== \n");

        BankClient bankClient = new BankClient("Jose Perez", 'M');
        System.out.println(bankClient);

        BankAccount account1 = new BankAccount(bankClient, 10000.0);
        System.out.println(account1);

        account1.deposit(100.0);
        account1.withdraw(100);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.deposit(100.0);
        account1.withdraw(100);
        account1.showOperations();

    }
}