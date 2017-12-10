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
public class Item {
    private String itName;
    private double itPrice;
    private String afName;

    public Item(String itName, double itPrice, String afName) {
        this.itName = itName;
        this.itPrice = itPrice;
        this.afName = afName;
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

    public String getAfName() {
        return afName;
    }

    public void setAfName(String afName) {
        this.afName = afName;
    }
    
}
