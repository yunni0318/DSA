/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author YUNNI
 */
public class Customer {
    
    private String cusName;
    private String cusPhone;
    private String cusAddress;
    private String cusCity;
    private String cusState;
    private String cusPostcode;
    private String cusPassword;

    public Customer(String cusName, String cusPhone, String cusAdd, String cusCity, String cusState, String cusPostcode, String cusPassword) {
        this.cusName = cusName;
        this.cusPhone = cusPhone;
        this.cusAddress = cusAdd;
        this.cusCity = cusCity;
        this.cusState = cusState;
        this.cusPostcode = cusPostcode;
        this.cusPassword = cusPassword;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAdd() {
        return cusAddress;
    }

    public void setCusAdd(String cusAdd) {
        this.cusAddress = cusAdd;
    }

    public String getCusCity() {
        return cusCity;
    }

    public void setCusCity(String cusCity) {
        this.cusCity = cusCity;
    }

    public String getCusState() {
        return cusState;
    }

    public void setCusState(String cusState) {
        this.cusState = cusState;
    }

    public String getCusPostcode() {
        return cusPostcode;
    }

    public void setCusPostcode(String cusPostcode) {
        this.cusPostcode = cusPostcode;
    }

    public String getCusPassword() {
        return cusPassword;
    }

    public void setCusPassword(String cusPassword) {
        this.cusPassword = cusPassword;
    }
}
