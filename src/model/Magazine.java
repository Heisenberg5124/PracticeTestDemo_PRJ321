package model;

import java.io.Serializable;

public class Magazine {
    private String mazID;
    private String mazTitle;
    private String publisher;
    private double price;

    public Magazine() {
    }

    public Magazine(String mazID, String mazTitle, String publisher, double price) {
        this.mazID = mazID;
        this.mazTitle = mazTitle;
        this.publisher = publisher;
        this.price = price;
    }

    public String getMazID() {
        return mazID;
    }

    public void setMazID(String mazID) {
        this.mazID = mazID;
    }

    public String getMazTitle() {
        return mazTitle;
    }

    public void setMazTitle(String mazTitle) {
        this.mazTitle = mazTitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "mazID='" + mazID + '\'' +
                ", mazTitle='" + mazTitle + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
