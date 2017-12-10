/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author YUNNI
 */
public class Payment {
    private int odID;
    private double deliveryFee;
    private double total;

    public Payment(int odID, double deliveryFee, double total) {
        this.odID = odID;
        this.deliveryFee = deliveryFee;
        this.total = total;
    }

    public int getOdID() {
        return odID;
    }

    public void setOdID(int odID) {
        this.odID = odID;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
