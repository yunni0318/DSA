/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Tea Evon
 */
public class OrderItem {
    private int odID;
    private String itName;
    private double itPrice;
    private int oiQuantity;
    private double oiPrice;

    public OrderItem(int odID, String itName, double itPrice, int oiQuantity, double oiPrice) {
        this.odID = odID;
        this.itName = itName;
        this.itPrice = itPrice;
        this.oiQuantity = oiQuantity;
        this.oiPrice = oiPrice;
    }

    public OrderItem(int odID, String itName, int oiQuantity, double oiPrice) {
        this.odID = odID;
        this.itName = itName;
        this.oiQuantity = oiQuantity;
        this.oiPrice = oiPrice;
    }

    public int getOdID() {
        return odID;
    }

    public void setOdID(int odID) {
        this.odID = odID;
    }

    public String getItName() {
        return itName;
    }

    public void setItName(String itName) {
        this.itName = itName;
    }

    public double getItPrice() {
        return itPrice;
    }

    public void setItPrice(double itPrice) {
        this.itPrice = itPrice;
    }

    public int getOiQuantity() {
        return oiQuantity;
    }

    public void setOiQuantity(int oiQuantity) {
        this.oiQuantity = oiQuantity;
    }

    public double getOiPrice() {
        return oiPrice;
    }

    public void setOiPrice(double oiPrice) {
        this.oiPrice = oiPrice;
    }

    
    
}
