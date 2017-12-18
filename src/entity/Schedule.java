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
public class Schedule {
    private String dName;
    private String clockIn;
    private String clockOff;
    private String sDate;

    public Schedule(String dName, String clockIn, String clockOff, String sDate) {
        this.dName = dName;
        this.clockIn = clockIn;
        this.clockOff = clockOff;
        this.sDate = sDate;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getClockIn() {
        return clockIn;
    }

    public void setClockIn(String clockIn) {
        this.clockIn = clockIn;
    }

    public String getClockOff() {
        return clockOff;
    }

    public void setClockOff(String clockOff) {
        this.clockOff = clockOff;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }
    
}
