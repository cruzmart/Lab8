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
    public void hasCity(){

        CustomList list = new CustomList(null, citylist);
        City city = new City("Calgary", "AB");
        list.addCity(city);
        list.getPosition(city);

    }
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
   // @Test
    //void testDeleteCity(){
      //  CityList cityList = mockCityList();
       // assertEquals(1, cityList.getCities().size());
       // cityList.delete(cityList.getCities().get(0));
       // assertEquals(0, cityList.getCities().size());
    //}
    //@Test
    //void testCountCities(){
      //  CityList cityList = mockCityList();
       // City city = new City("Red Deer", "Alberta");
        //cityList.add(city);
        //assertEquals(2, cityList.countCities());
    //}
}
