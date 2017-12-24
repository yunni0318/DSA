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
public class OrderDelivery {

    @Override
    public String toString() {
        return "OrderDelivery{" + "odID=" + odID + ", odTime=" + odTime + ", odDate=" + odDate + ", cusName=" + cusName + ", cusPhone=" + cusPhone + ", subTotal=" + subTotal + ", deliveryFee=" + deliveryFee + ", total=" + total + ", dName=" + dName + ", afName=" + afName + ", distance=" + distance + ", status=" + status + '}';
    }

    private int odID;
    private String odTime;
    private String odDate;
    private String cusName;
    private String cusPhone;
    private double subTotal;
    private double deliveryFee;
    private double total;
    private String dName;
    private String afName;
    private double distance;
    private String status;

    public OrderDelivery(int odID, String odTime, String odDate, String cusName, String cusPhone, double subTotal, double deliveryFee, double total, String dName, String afName, double distance, String status) {
        this.odID = odID;
        this.odTime = odTime;
        this.odDate = odDate;
        this.cusName = cusName;
        this.cusPhone = cusPhone;
        this.subTotal = subTotal;
        this.deliveryFee = deliveryFee;
        this.total = total;
        this.dName = dName;
        this.afName = afName;
        this.distance = distance;
        this.status = status;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
