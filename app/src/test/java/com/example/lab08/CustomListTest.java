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

        // before adding
        assertFalse(list.hasCity(edmonton));

        list.addCity(edmonton);

        // after adding
        assertTrue(list.hasCity(edmonton));
    }
}
