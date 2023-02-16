package org.itstep;

import java.util.Arrays;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        // Nested classes (вкладені класи):
        //  - Nested Static classes (вкладені статичні класи)
        //  - Inner Non static classes (внутришні нестатичні класи)
        //  - Local classes (локальні класи)
        //  - Anonymous classes (анонімні класи)
        Human human = new Human("Cap");
        System.out.println(human);
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for(Object item: arrayList) {
            System.out.println(item);
        }
    }
}

class Human {
    private static int count;
    private String name;
    static class Cap {
        static final String RED = "Red";
        private String color;
        public Cap(String color) {
            this.color = color;
            System.out.println(count);
        }
    }
    private Cap cap;
    public Human(String name) {
        this.name = name;
        //this.cap = new Cap(Cap.RED);
    }
    @Override
    public String toString() {
        return cap.color + " " + name;
    }
}

class ArrayList implements Iterable {
    private Object[] values = new Object[0];

    private static class Itr implements Iterator {
        private final Object[] values;
        private int idx;

        public Itr(Object[] values) {
            this.values = values;
        }

        @Override
        public boolean hasNext() {
            return idx < values.length;
        }

        @Override
        public Object next() {
            return values[idx++];
        }
    }

    public void add(Object item) {
        values = Arrays.copyOf(values, values.length + 1);
        values[values.length - 1] = item;
    }

    @Override
    public Iterator iterator() {
        return new Itr(values);
    }
}