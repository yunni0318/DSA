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
public class OrderDelivery {
    private int odID;
    private String odTime;
    private String odDate;
    private String cusName;
    private double subTotal;
    private String dName;
    private String afName;
    private double distance;

    public OrderDelivery(int odID, String odTime, String odDate, String cusName, double subTotal, String dName, String afName, double distance) {
        this.odID = odID;
        this.odTime = odTime;
        this.odDate = odDate;
        this.cusName = cusName;
        this.subTotal = subTotal;
        this.dName = dName;
        this.afName = afName;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getOdID() {
        return odID;
    }

    public void setOdID(int odID) {
        this.odID = odID;
    }

    public String getOdTime() {
        return odTime;
    }

    public void setOdTime(String odTime) {
        this.odTime = odTime;
    }

    public String getOdDate() {
        return odDate;
    }

    public void setOdDate(String odDate) {
        this.odDate = odDate;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getAfName() {
        return afName;
    }

    public void setAfName(String afName) {
        this.afName = afName;
    }

}
