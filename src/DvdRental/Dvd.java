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
public class Dvd {
    
    private String title;
    private String category;
    private boolean newRelease;
    private boolean availableForRental;
    private double price;
    
    public Dvd(){}
    
    public Dvd(String title,  String category, boolean newRelease, boolean avail){
        this.title = title;
        this.category = category;
        this.newRelease = newRelease;
        availableForRental = avail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String aTitle ) {
        this.title = aTitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory ) {
        this.category = aCategory ;
    }

    public boolean isNewRelease() {
        return newRelease;
    }

    public void setNewRelease(boolean rel) {
        this.newRelease = rel;
    }

    public boolean isAvailableForRental() {
        return availableForRental;
    }

    public void setAvailableForRental(boolean avail) {
        this.availableForRental = avail;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
