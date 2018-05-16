package DvdRental;
/**
 * Class:       Customer.java
 * Group:       2A
 * Author:      Banele Mlamleli
 *              Nelson Mpyana
 * Due date:    Fri. 18 May 2018 20:00
 */
public class Customer implements Comparable<Customer>{
    
    private String firsName;
    private String surname;
    private String phoneNum;
    private double credit;
    private boolean canRent;
    
    public Customer(){}
    
    public Customer(String fName, String sName, String phone, double credAmt, boolean can){
        this.firsName = fName;
        this.surname = sName;
        this.phoneNum = phone;
        this.credit = credAmt;
        this.canRent = can;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public boolean isCanRent() {
        return canRent;
    }

    public void setCanRent(boolean canRent) {
        this.canRent = canRent;
    }

    @Override
    public int compareTo(Customer other) {
        int compareInt = this.firsName.compareTo(other.firsName);
        if (compareInt < 0) {
            return -1;	//this.title is bigger
        }
        if (compareInt > 0) {
            return 1;	//this.title is smaller
        }
        return 0;	//they are equal
    }
    
    @Override
    public String toString(){
        return " "+getFirsName()+"\t| "+getSurname()+"\t| "+getPhoneNum()+"\t\t| "+getCredit()+"\t| "+isCanRent();
    } 
}
