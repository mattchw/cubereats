package com.example.tommylee.cubereats;

import java.util.ArrayList;

public class Order {

    /**
     * imgurl :
     * name : Med Can
     * time : 07:00-22:00
     */

    private String customerID;
    private String driverID;
    private ArrayList<String> mealID = new ArrayList<>();
    private Boolean isPaid;
    private String documentID;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public Boolean getPaid() { return isPaid; }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public void setDocumentID(String documentID) { this.documentID = documentID; }

    public ArrayList<String> getMealID() {
        return mealID;
    }

    public void setMealID(ArrayList<String> mealID) {
        this.mealID = mealID;
    }
}
