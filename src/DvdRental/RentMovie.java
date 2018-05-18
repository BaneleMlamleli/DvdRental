package DvdRental;
public class RentMovie {
    private String rentedMovieTitle;
    private String custmerPhoneNumber;
    private String customerName;
    private String customerSurname;
    private boolean newRelease;
    private double price;
    
    public RentMovie(String rentedMovieTitle, String custmerPhoneNumber, String customerName, String customerSurname){
        this.rentedMovieTitle = rentedMovieTitle;
        this.custmerPhoneNumber = custmerPhoneNumber;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
    }

    public String getRentedMovieTitle() {
        return rentedMovieTitle;
    }

    public void setRentedMovieTitle(String rentedMovieTitle) {
        this.rentedMovieTitle = rentedMovieTitle;
    }

    public String getCustmerPhoneNumber() {
        return custmerPhoneNumber;
    }

    public void setCustmerPhoneNumber(String custmerPhoneNumber) {
        this.custmerPhoneNumber = custmerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    @Override
    public String toString(){
        return getCustomerName()+", "+getCustomerSurname()+", "+getRentedMovieTitle()+", "+getCustmerPhoneNumber();
    }
}
