package com.eliezer.project5780.data.repositories;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class DeliveryDatabase extends RoomDatabase {

    private static DeliveryDatabase instance;

    public abstract DeliveryDao deliveryDao();

    public  static  synchronized  DeliveryDatabase getInstance(Context context)  {
        if (instance == null ) {
            instance = Room.databaseBuilder(context.getApplicationContext(),DeliveryDatabase.class,
            "deliveryDatabase")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
