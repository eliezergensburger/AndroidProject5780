package com.eliezer.project5780.data.model;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class DeliveryRepository {
    private LiveData<List<Delivery>> allDeliveries;

    public DeliveryRepository(Application application) {

    }

    public  LiveData<List<Delivery>> getAllDeliveries() {
        return allDeliveries;
    }
    //TO DO
}
