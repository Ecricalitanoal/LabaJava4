package org.example;

import org.example.Models.Division;
import org.example.Models.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testToString() {
        Division division = new Division("I");
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        Person person = new Person(1, "Mori", "Male", birthDate, division, 200);

        String neededResult = "Person{id = 1, name = 'Mori', gender = Male, division = Division{id='1', name='I'}, salary = 200.0, birthDate = 2000-01-01}";
        assertEquals(neededResult, person.toString());
    }

    @Test
    void testConstructor() {
        Division division = new Division("I");
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        Person person = new Person(1, "Mori", "Male", birthDate, division, 200);

        assertNotNull(person);
        assertEquals(1, person.getId());
        assertEquals("Mori", person.getName());
        assertEquals("Male", person.getGender());
        assertEquals(birthDate, person.getBirthDate());
        assertEquals(division, person.getDivision());
        assertEquals(200, person.getSalary());
    }

}