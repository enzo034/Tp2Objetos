//From exercise 3

package Tp2Objetos;

import java.util.UUID;
public class BankAccount
{
    private UUID id;
    private double balance;
    private BankClient client;
    private String[] operations;
    private int numberOfOperations;

    public BankAccount(BankClient client, double balance)
    {
        this.client = client;
        this.balance = balance;
        this.id = UUID.randomUUID();
        this.operations = new String[10];
        this.numberOfOperations = 0;
    }

    public BankClient getClient() {
        return client;
    }
    public UUID getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBankClient(BankClient client) {
        this.client = client;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double deposit)
    {
        if(numberOfOperations > 9)
        {
            System.out.println("Quantity of operations reached (10), The deposit of " + deposit + " pesos, isn't possible.");
            return balance;
        }else
        {
            operations[numberOfOperations] = "The client = " + client.getName() + " deposit " + deposit + " pesos to his account.";
            ++numberOfOperations;
            return balance+=deposit;
        }

    }

    public double withdraw(double withdraw)
    {
        if(numberOfOperations < 10)
        {
            if(balance >= withdraw || balance >= -2000)
            {

                balance-=withdraw;
                if(balance < -2000)
                {
                    balance+=withdraw;
                    System.out.println("Isn't possible to withdraw "+ withdraw +", insufficient balance = " + balance);
                }
                else
                {
                    operations[numberOfOperations] = "The client = " + client.getName() + " withdrew " + withdraw + " pesos from his account.";
                    ++numberOfOperations;

                }
            }
            else
            {
                System.out.println("Isn't possible to withdraw "+ withdraw +", insufficient balance = " + balance);
            }
        }else
        {
            System.out.println("Quantity of operations reached (10), the withdraw of " + withdraw + " pesos, isn't possible.");
        }

        return balance;
        //return balance > retiro ? balance-=retiro : balance;
    }

    public void showOperations()
    {
        System.out.println("\n\nOperations performed : \n");
        for(int i = 0; i < numberOfOperations; i++)
        {
            System.out.println(operations[i]);
        }
    }

    @Override
    public String toString() {
        return  "Client's name = " + client.getName() +
                " | Balance = " + balance +
                " | ID account = " + id;
    }
}