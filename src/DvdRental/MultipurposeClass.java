/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DvdRental;

import java.util.ArrayList;

/**
 * @author Banele Mlamleli
 * @author Nelson Mpyana
 */
public class MultipurposeClass{
    
    public ArrayList addCustomer(){//String name, String surname, String phoneNumber, double credit, boolean canRent){
        Customer cust = null;
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(cust.getFirsName(), cust.getSurname(), cust.getPhoneNum(), cust.getCredit(), cust.isCanRent()));//name, surname, phoneNumber, credit, canRent));
        //customers.add(new Customer("Sethu", "Mhlanga", "1234567890", 10.50, false));
        return customers;
    }
    
    //Displaying all movies
    public void displayAllMovies(){
        //tblDisplayAllMovies
    }
    
    //Displaying all available movies for rental
    public void displayAvailableMovies(){
        //tblDisplayAvailableMovies
    }
    
    //Display all customers in the system
    public void displayAllCustomers(){
        //ArrayList<Customer>  allCustomers = addCustomers(); 
        //tblDisplayAllCustomers
    }
}
