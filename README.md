# DvdRental
DVD Rental project

Menu options are:
- Add
  Sub-menu: Customer
            Movie
 
 -Delete
  Sub-menu: Customer
            Movie
            
Sorted List of Movies
Sorted List of Available Movies
Sorted List of Customers
List Movies that start with…
Rent Movie
Exit
Details of Menu options:
Add
When this option is selected, a sub-menu is displayed with the options to add a customer or a Dvd to the system.
If there is no more space in the arraylists, display an error message.
When entering a movie category, the user must not type in the name of the category.
1.	Horror
2.	Sci-fi
3.	Drama
4.	Romance
5.	Comedy
6.	Action
7.	Cartoon

Delete
When this option is selected, a sub-menu is displayed with the options to delete a customer or a Dvd from the system.
A customer’s phone number is used to locate a customer to delete from the arraylist.
A movie title is used to locate a Dvd to delete from the arraylist.

Sorted List of all Movies 
Sort on titles

Sorted List of Available Movies
Sort on titles

List Movies that start with…
The user enters a letter and all movies that start with that letter are listed.
all movie lists must show the movie title, category, whether new release or not, whether available or not.

Sorted List of Customers
customer list sorted on surname, must show the customer name, surname, phone number, credit.

Rent Movie
A customer can only rent one Dvd at a time. A customer can only rent if a previously rented Dvd has been returned. The attribute canRent indicates whether a customer is allowed to rent a Dvd: When a customer rents a Dvd this attribute is set to FALSE. When a customer returns a Dvd, this attribute is set to TRUE.

The customer must exist on the system before this transaction can take place. Use the customer’s phone number to verify this. 
The requested movie title must be verified to be on the system, as well as being available for rent.
The fee for a movie is R10, and new releases are R5 more. This fee is deducted from the customer’s credit.

If a customer has insufficient credit the option to pay the movie fee for this transaction is shown. The customer can choose to pay the required fee, or load R100 credit, or neither and thereby cancel the transaction. After a valid transaction, the rented movie is then marked as ‘not available’.
