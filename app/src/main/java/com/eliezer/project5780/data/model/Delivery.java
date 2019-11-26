package com.eliezer.project5780.data.model;

import android.location.Location;
import android.telecom.PhoneAccount;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Deliveries")
public class Delivery {
    @PrimaryKey(autoGenerate = true)
    private int id;

    ParcelType  parcelType;
    boolean fragile;
    ParcelWeight parcelWeight;
    Location location; //from GPS
    Recipient recipient;
    String phoneAccount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Delivery() {
    }

    public Delivery(int id, ParcelType parcelType, boolean fragile, ParcelWeight parcelWeight, Location location, Recipient recipient, String phoneAccount) {
        this.id=id;
        this.parcelType = parcelType;
        this.fragile = fragile;
        this.parcelWeight = parcelWeight;
        this.location = location;
        this.recipient = recipient;
        this.phoneAccount = phoneAccount;
    }

    public ParcelType getParcelType() {
        return parcelType;
    }

    public void setParcelType(ParcelType parcelType) {
        this.parcelType = parcelType;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public ParcelWeight getParcelWeight() {
        return parcelWeight;
    }

    public void setParcelWeight(ParcelWeight parcelWeight) {
        this.parcelWeight = parcelWeight;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public String getPhoneAccount() {
        return phoneAccount;
    }

    public void setPhoneAccount(String phoneAccount) {
        this.phoneAccount = phoneAccount;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", parcelType=" + parcelType +
                ", fragile=" + fragile +
                ", parcelWeight=" + parcelWeight +
                ", location=" + location +
                ", recipient=" + recipient +
                ", phoneAccount='" + phoneAccount + '\'' +
                '}';
    }

 }
