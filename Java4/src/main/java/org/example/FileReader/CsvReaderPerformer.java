package org.example.FileReader;


import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.example.Models.Division;
import org.example.Models.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvReaderPerformer {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public List<Person> readCSVPersons(String csvFilePath, char separator) {

        List<Person> personList = new ArrayList<>();
        Map<String, Division> divisionsMap = new HashMap<>();

        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath);
             InputStreamReader inputStreamReader = new InputStreamReader(in);
             CSVReader reader = in == null ? null
                     : new CSVReaderBuilder(inputStreamReader)
                     .withCSVParser(new CSVParserBuilder().withSeparator(separator).build())
                     .build()) {

            if (reader == null) {
                throw new FileNotFoundException("File not found: " + csvFilePath);
            }

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length < 6)
                    continue;

                Person person = parseLineFromCSVToPerson(nextLine, divisionsMap);
                personList.add(person);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not Found! : " + csvFilePath);
        } catch (Exception e) {
            System.err.println("Error! : " + e.getMessage());
        }
        return personList;
    }

    private Person parseLineFromCSVToPerson(String[] data, Map<String, Division> divisionsMap) {
        int id = Integer.parseInt(data[0]);
        String name = data[1];
        String gender = data[2];
        String divisionLetter = data[3];
        double salary = Double.parseDouble(data[4]);
        LocalDate birthDate = LocalDate.parse(data[5], DATE_FORMATTER);

        Division division = divisionsMap.get(divisionLetter);
        if (division == null) {
            division = new Division(divisionLetter);
            divisionsMap.put(divisionLetter, division);
        }

        return new Person(id, name, gender, birthDate, division, salary);
    }
}