package com.eliezer.project5780.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.eliezer.project5780.data.model.Delivery;
import com.eliezer.project5780.data.model.DeliveryRepository;
import com.eliezer.project5780.data.repositories.DeliveryDao;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private DeliveryRepository deliveryRepository;
    private LiveData<List<Delivery>> alldeliveries;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        deliveryRepository = new DeliveryRepository(application);
        alldeliveries= DeliveryRepository.getAllDeliveries();
    }
}
