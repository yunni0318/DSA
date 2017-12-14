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
public class Deliveryman {
    private String dName;
    private String dActive;
    private String dReason;
    private String dPhone;
    private String dAddress;
    private int dNoOfTask;
    private String dStatus;

    public Deliveryman(String dName, String dActive, String dReason, String dPhone, String dAddress, int dNoOfTask, String dStatus) {
        this.dName = dName;
        this.dActive = dActive;
        this.dReason = dReason;
        this.dPhone = dPhone;
        this.dAddress = dAddress;
        this.dNoOfTask = dNoOfTask;
        this.dStatus = dStatus;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdActive() {
        return dActive;
    }

    public void setdActive(String dActive) {
        this.dActive = dActive;
    }

    public String getdReason() {
        return dReason;
    }

    public void setdReason(String dReason) {
        this.dReason = dReason;
    }

    public String getdPhone() {
        return dPhone;
    }

    public void setdPhone(String dPhone) {
        this.dPhone = dPhone;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    public int getdNoOfTask() {
        return dNoOfTask;
    }

    public void setdNoOfTask(int dNoOfTask) {
        this.dNoOfTask = dNoOfTask;
    }

    public String getdStatus() {
        return dStatus;
    }

    public void setdStatus(String dStatus) {
        this.dStatus = dStatus;
    }
    
}
