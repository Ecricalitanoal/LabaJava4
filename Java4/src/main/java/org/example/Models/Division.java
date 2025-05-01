package org.example.Models;

public class Division {
    private static int uniqueId = 1;

    private final int id;
    private final String name;

    private static int getNewUniqueId() {
        return uniqueId++;
    }

    public Division(String name) {
        this.id = getNewUniqueId();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Division{id='" + id + "', name='" + name + "'}";
    }
}

