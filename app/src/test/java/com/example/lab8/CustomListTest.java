package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> citylist = new ArrayList<>();

    @Test
    public void testAddCity(){
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.getCount());
    }
    @Test
    void testHasCity(){
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
   @Test
   void testDeleteCity(){
       CustomList list = new CustomList(null, citylist);
       City city = new City("Edmonton", "AB");
       list.addCity(city);
       assertEquals(1, list.countCities());
       list.delete(city);
       assertEquals(0, list.countCities());
    }
    @Test
    void testCountCities(){
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(0, list.getCount());
        list.delete(city);
        assertEquals(1, list.getCount());
    }
}
