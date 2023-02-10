package Notebook;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.


public class Laptop {
    int id;
    int ram;
    int ssd;
    String os;
    String color;
    private Object o;

    public Laptop(int id, int ram, int ssd, String os, String color) {
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s", id, ram, ssd, os, color);
    }

    public boolean equals(Object o) {
        this.o = o;
        Laptop t = (Laptop) o;
        return id == t.id;
    }
}