package com.example.lab08;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomListTest {

    private CustomList makeList() {
        return new CustomList();
    }

    @Test
    public void hasCity_falseBeforeAdd_trueAfterAdd() {
        CustomList list = makeList();
        City edmonton = new City("Edmonton", "Alberta");
        assertFalse(list.hasCity(edmonton));
        list.addCity(edmonton);
        assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void deleteCity_removesCity() {
        CustomList list = makeList();
        City edmonton = new City("Edmonton", "Alberta");
        list.addCity(edmonton);
        assertTrue(list.hasCity(edmonton));
        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void countCities_returnsCorrectNumber() {
        CustomList list = makeList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Edmonton", "Alberta"));
        list.addCity(new City("Calgary", "Alberta"));
        assertEquals(2, list.countCities());
    }
}
