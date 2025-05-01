package org.example;

import org.example.FileReader.CsvReaderPerformer;
import org.example.Models.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit Тесты для класса CsvReaderPerformer.
 */
class CsvReaderTest {


    /**
     * Проверка чтения корректного сsv-файла.
     */
    @Test
    void testValidFile() throws Exception {
        CsvReaderPerformer readerService = new CsvReaderPerformer();
        String validFile = "foreign_names.csv";
        char separator = ';';

        List<Person> personList = readerService.readCSVPersons(validFile, separator);

        assertNotNull(personList);
        assertFalse(personList.isEmpty());

        Person firstInFile = personList.get(0);
        //28281;Aahan;Male;15.05.1970;I;4800
        assertEquals(28281, firstInFile.getId());
        assertEquals("Aahan", firstInFile.getName());
        assertEquals("Male", firstInFile.getGender());
        assertEquals("I", firstInFile.getDivision().getName());
    }
    /**
     * Проверка чтения некорректного сsv-файла.
     */
    @Test
    void testInvalidFile() {
        CsvReaderPerformer readerService = new CsvReaderPerformer();
        String invalidFile = "notfound.csv";
        char separator = ';';

        List<Person> people = readerService.readCSVPersons(invalidFile, separator);
        assertTrue(people.isEmpty());
    }

}