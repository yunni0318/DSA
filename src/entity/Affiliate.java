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
public class Affiliate {

    private String afName;
    private String afAddress;
    private String afCity;
    private String afState;
    private String afPostcode;
    private String afPassword;

    public Affiliate(String afName, String afAddress, String afCity, String afState, String afPostcode, String afPassword) {
        this.afName = afName;
        this.afAddress = afAddress;
        this.afCity = afCity;
        this.afState = afState;
        this.afPostcode = afPostcode;
        this.afPassword = afPassword;
    }

    public String getAfName() {
        return afName;
    }

    public void setAfName(String afName) {
        this.afName = afName;
    }

    public String getAfAddress() {
        return afAddress;
    }

    public void setAfAddress(String afAddress) {
        this.afAddress = afAddress;
    }

    public String getAfCity() {
        return afCity;
    }

    public void setAfCity(String afCity) {
        this.afCity = afCity;
    }

    public String getAfState() {
        return afState;
    }

    public void setAfState(String afState) {
        this.afState = afState;
    }

    public String getAfPostcode() {
        return afPostcode;
    }

    public void setAfPostcode(String afPostcode) {
        this.afPostcode = afPostcode;
    }

    public String getAfPassword() {
        return afPassword;
    }

    public void setAfPassword(String afPassword) {
        this.afPassword = afPassword;
    }
}
