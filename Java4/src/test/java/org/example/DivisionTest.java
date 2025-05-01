package org.example;

import org.example.Models.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Тесты для класса Division.
 */

public class DivisionTest {

    /**
     * Проверка метода toString().
     */
    @Test
    void testToString() {
        Division division = new Division("div1");
        String neededResult = "Division{id='" + division.getId() + "', name='div1'}";
        assertEquals(neededResult, division.toString());
    }
    /**
     * Проверка создания отдела.
     */
    @Test
    void testConstructor() {
        String divisionName = "I";
        Division division = new Division(divisionName);
        assertEquals(divisionName, division.getName());
        assertTrue(division.getId() > 0);
    }

    /**
     * Проверка автоинкремента id отдела.
     */
    @Test
    void testIdAutoIncrement() {
        Division dept1 = new Division("div1");
        Division dept2 = new Division("div2");
        Division dept3 = new Division("div3");
        Division dept4 = new Division("div4");

        assertTrue(dept2.getId() > dept1.getId());
        assertEquals(dept4.getId(), 4);
    }
}
