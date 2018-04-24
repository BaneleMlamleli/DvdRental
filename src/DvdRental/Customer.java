/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DvdRental;

/**
 *
 * @author Banele Mlamleli
 * @author Nelson Mpyana
 */
public class Customer {
    
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
    public String toString(){
        return "";
    }    
}
