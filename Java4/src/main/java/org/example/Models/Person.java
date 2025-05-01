package org.example.Models;

import java.time.LocalDate;

/**
 * Класс, представляющий информацию о сотруднике и его отделе.
 */
public class Person {

    /** Уникальный идентификатор сотрудника */
    private final int id;

    /** Полное имя сотрудника */
    private final String name;

    /** Пол сотрудника */
    private final String gender;

    /** Дата рождения сотрудника */
    private final LocalDate birtDate;

    /** Подразделение, в котором работает сотрудник */
    private final Division division;

    /** Заработная плата сотрудника */
    private final double salary;

    /**
     * Создает новый объект Person.
     *
     * @param id        уникальный идентификатор сотрудника
     * @param name      полное имя сотрудника
     * @param gender    пол сотрудника
     * @param birthDate дата рождения
     * @param division  подразделение компании
     * @param salary    размер заработной платы
     * @throws IllegalArgumentException если переданы некорректные параметры
     */
    //id;name;gender;BirtDate;Division;Salary
    public Person(int id, String name, String gender, LocalDate birthDate,
                  Division division, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birtDate = birthDate;
        this.division = division;
        this.salary = salary;
    }

    /**
     * Возвращает идентификатор сотрудника.
     *
     * @return числовой идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает полное имя сотрудника.
     *
     * @return строка с именем
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает пол сотрудника.
     *
     * @return строка с указанием пола
     */
    public String getGender() {
        return gender;
    }

    /**
     * Возвращает дату рождения сотрудника.
     *
     * @return объект LocalDate с датой рождения
     */
    public LocalDate getBirthDate() {
        return birtDate;
    }

    /**
     * Возвращает подразделение сотрудника.
     *
     * @return объект Division
     */
    public Division getDivision() {
        return division;
    }

    /**
     * Возвращает размер заработной платы.
     *
     * @return значение зарплаты
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Возвращает строковое представление объекта.
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Person{" + "id = " + id + ", name = '" + name + '\'' +
                ", gender = " + gender + ", division = " + division.toString() +
                ", salary = " + salary + ", birthDate = " + birtDate + '}';
    }
}