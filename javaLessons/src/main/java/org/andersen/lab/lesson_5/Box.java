package org.andersen.lab.lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;
    public List<T> getList() {
        return list;
    }

    public Box() {
        list = new ArrayList<T>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveAt(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    void info() {
        if (list.isEmpty()) {
            System.out.println("Box is empty");
        } else {
            System.out.println("There are " + list.size() + " " + list.get(0).toString() + " in the box.");
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}
