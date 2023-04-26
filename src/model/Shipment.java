/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;

/**
 *
 * @author yulon
 */
public class Shipment {
    
    private int trackingNum;
    private int phoneNum;
    private int driverID;
    private String startCountry;
    private String startPostalCode;
    private String startAddress;
    private Date startDate;
    private Date arriveDate;
    private String desCountry;
    private String desPostalCode;
    private String desAddress;
    private String packageInfo;
    private Status status;
    private Dictionary<String, Date> arrivals;

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public Shipment() {
        status = new Status();
    }

    public String getStartCountry() {
        return startCountry;
    }

    public void setStartCountry(String startCountry) {
        this.startCountry = startCountry;
    }

    public String getStartPostalCode() {
        return startPostalCode;
    }

    public void setStartPostalCode(String startPostalCode) {
        this.startPostalCode = startPostalCode;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }
    
    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public String getDesAddress() {
        return desAddress;
    }

    public void setDesAddress(String desAddress) {
        this.desAddress = desAddress;
    }

    public int getTrackingNum() {
        return trackingNum;
    }

    public void setTrackingNum(int trackingNum) {
        this.trackingNum = trackingNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getDesCountry() {
        return desCountry;
    }

    public void setDesCountry(String desCountry) {
        this.desCountry = desCountry;
    }

    public String getDesPostalCode() {
        return desPostalCode;
    }

    public void setDesPostalCode(String desPostalCode) {
        this.desPostalCode = desPostalCode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(String packageInfo) {
        this.packageInfo = packageInfo;
    }

    public Dictionary<String, Date> getArrivals() {
        return arrivals;
    }

    public void setArrivals(Dictionary<String, Date> arrivals) {
        this.arrivals = arrivals;
    }
    
}
