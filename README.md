# Tp2Objetos

Statements

1.
It is necessary to model the Book type object with the following characteristics, title,
price, stock and Author, the latter has the characteristics of name, surname,
email and gender ('M' or 'F'). For this exercise we are going to assume that a book has a
sole author. Run the following instructions:

a. Initialize an object of type Author, “Joshua”, “Bloch”, “joshua@email.com”, 'M'.

b. Print the previously instantiated author on the screen.

c. Initialize the book "Effective Java" by the Author "Joshua Bloch" which costs 450
pesos with a quantity of 150 copies.

d. Print the instantiated workbook on screen.

e. Modify the price of the book "Effective Java" to 500 pesos and increase the
quantity in 50 copies.

f. Print the attributes of Author Joshua on the screen, accessing from the
Book "Effective Java".

g. Add a method to the Book class that makes it possible to print on the screen the
following message:

“The book, {title} by {author's name}. It is sold at {price} pesos.”

h. Modify the Book class, so that it accepts more than 1 Author. And doing the
necessary changes to the g-spot method, to print a new
message listing the authors who contributed to that book.


2.
Make a program that takes control of the sales of a local. For this it is necessary to model the Customer class, 
which has an id attribute as client identifier, it must be a value made up of letters and
random numbers that are automatically generated when creating a Customer. The client
it also has a name, an email and a discount percentage.
On the other hand we are going to have the bill object that represents a sale of the
local, each bill has an identifier with the same characteristics as the
used in Client. In turn, each bill has a total amount, a date and the Client
that generated the purchase. For the date of the sale, the date and time will be assigned to the
moment of creation of the bill object. The bill type must have a
method that calculates the final amount after applying the discount that the
customer.

a. Investigate the UUID class and its static methods for generating the UUIDs.
ids. Investigate the LocalDate class and its static methods for generation
of the date.

b. Create an object of type Customer, print its details to the screen. For this
use a method that makes it easy to print.
Client[id=?, name=?, email=?, discount=?]

c. Create an object of type bill that owns the previously created Customer.
Once this is done, print on the screen the total amount of this bill and the
total amount after applying the discount.

d. Create a method that makes it easy to print the bill type object and that
follow the following format.

Bill[id=?, date=?, amount=?, amountDesc=?, Customer[id=?, name=?,
email=?, discount=?]]

e. Analyze to add the type SaleItem, which represents a product that
is part of the sale. It contains an id, a name, description and
unit price. Consider the necessary modifications in the bill type
so that it can store multiple sales items and in turn
Calculate the total amounts with and without the discount applied.


3.
Create a program to handle the data of a bank account of
a client. For this we identify the attributes id, name and gender (M or F) for the
Customer. On the other hand we have the Account type that also has an identifier,
a balance and a Client who is the owner of the account. The Account must expose the
deposit and withdraw methods that modify the balance of the same. Something to keep in
account is that the extract method cannot extract money if the total balance does not
allowed, if this happens a message must be printed on the screen indicating that
the account does not have a sufficient balance.

a. It is necessary to add an Account variant that allows a debit balance,
of maximum 2000 pesos. This means that the account can accept a
Negative balance with a maximum of -2000. Make changes and test
necessary.

b. Change the account class to let the customer make only 10 operations.

//All of this was translated from spanish.
