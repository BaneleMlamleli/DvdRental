package DvdRental;
/**
 * Class:       Dvd.java
 * Group:       2A
 * Author:      Banele Mlamleli
 *              Nelson Mpyana
 * Due date:    Fri. 18 May 2018 20:00
 */
public class Dvd implements Comparable<Dvd> {
    
    private String title;
    private String category;
    private boolean newRelease;
    private boolean availableForRental;
    private double price;
    
    public Dvd(){}
    
    public Dvd(String title,  String category, double price, boolean newRelease, boolean avail){
        this.title = title;
        this.category = category;
        this.newRelease = newRelease;
        this.price = price;
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
    public int compareTo(Dvd other) {
        int compareInt = this.title.compareTo(other.title);
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
        return " "+getTitle()+"\t| "+getCategory()+"\t| "+isNewRelease()+"\t    | "+getPrice()+"\t| "+isAvailableForRental();
    }
}
