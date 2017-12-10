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
public class Customer {
    
    private String cusName;
    private String cusAddress;
    private String cusCity;
    private String cusState;
    private String cusPostcode;
    private String cusPassword;

    public Customer(String cusName, String cusAdd, String cusCity, String cusState, String cusPostcode, String cusPassword) {
        this.cusName = cusName;
        this.cusAddress = cusAdd;
        this.cusCity = cusCity;
        this.cusState = cusState;
        this.cusPostcode = cusPostcode;
        this.cusPassword = cusPassword;
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
