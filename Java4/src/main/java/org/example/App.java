package org.example;

import org.example.FileReader.CsvReaderPerformer;
import org.example.Models.Person;

import java.util.List;

/**
 * Основной класс для обработки данных из csv фалйа о сотрудниках.
 */
public class App {

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        String csvFilePath = "foreign_names.csv";
        char separator = ';';

        CsvReaderPerformer csvReaderPerformer = new CsvReaderPerformer();

        try {
            List<Person> personsList = csvReaderPerformer.readCSVPersons(csvFilePath, separator);

            for (int i = 0; i < personsList.size(); i++) {
                System.out.println(personsList.get(i));
            }
        } catch (Exception e) {
            System.err.println("Error! : " + e.getMessage());
        }
    }
}
