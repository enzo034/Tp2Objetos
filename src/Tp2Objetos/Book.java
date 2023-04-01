//From exercise 1

package Tp2Objetos;

import java.util.Arrays;
public class Book
{
    private String title;
    private double price;
    private int stock;
    private Author[] authors;

    public Book(String title, double price, int stock, Author[] autor)
    {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = autor;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String printMsj()
    {
        StringBuilder names = new StringBuilder();

        for(Author author : authors)
        {
            if(author!=null)
            {
                names.append(author.getName());
                names.append(" ");
                names.append(author.getSurname());
                names.append("-");
            }
        }
        return "The book, " + this.title + " of " + names + ". Is being sold at " + this.price + " pesos.";
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + Arrays.toString(authors) +
                '}';
    }

}