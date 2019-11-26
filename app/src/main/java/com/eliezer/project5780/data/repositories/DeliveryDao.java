package com.eliezer.project5780.data.repositories;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.eliezer.project5780.data.model.Delivery;

import java.util.List;

@Dao
 public interface DeliveryDao {

     @Insert
     long[] insertNotes(Delivery... deliveries);

     @Query("SELECT * FROM deliveries")
     LiveData<List<Delivery>> getDeliveries();

     @Delete
     int delete(Delivery... deliveries);

     @Query("DELETE FROM deliveries")
     void deleteAllDeliveries();

     @Update
     int updateNotes(Delivery... deliveries);
 }
