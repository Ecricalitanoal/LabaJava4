package org.example.Models;

/**
 * Класс, представляющий подразделение организации.
 */
public class Division {

    /**
     * Счетчик для генерации уникальных идентификаторов.
     * Начинается с 1 и увеличивается при каждом создании нового подразделения.
     */
    private static int uniqueId = 1;

    /**
     * Уникальный идентификатор подразделения.
     */
    private final int id;

    /**
     * Название подразделения.
     */
    private final String name;

    /**
     * Генерирует новый уникальный идентификатор для подразделения.
     *
     * @return следующий доступный уникальный ID
     */
    private static int getNewUniqueId() {
        return uniqueId++;
    }

    /**
     * Создает новое подразделение с указанным названием.
     *
     * @param name название подразделения (не должно быть null или пустым)
     * @throws IllegalArgumentException если имя подразделения null или пустое
     */
    public Division(String name) {
        this.id = getNewUniqueId();
        this.name = name;
    }

    /**
     * Возвращает уникальный идентификатор подразделения.
     *
     * @return числовой идентификатор подразделения
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает название подразделения.
     *
     * @return строку с названием подразделения
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает строковое представление подразделения.
     * @return строковое представление объекта подразделения
     */
    @Override
    public String toString() {
        return "Division{id='" + id + "', name='" + name + "'}";
    }
}