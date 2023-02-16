package org.itstep.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CarShop implements Iterable {
    private final String name;
    private Car[] cars;// = new Car[0];

    public CarShop(String name) {
        this.name = name;
        cars = new Car[0];
    }

    public void add(Object... items) {
        for(Object item: items) {
            cars = Arrays.copyOf(cars, cars.length + 1);
            cars[cars.length - 1] = (Car) item;
        }
    }

    @Override
    public Iterator iterator() {
        return new Itr(cars);
    }

    private static class Itr implements Iterator {
        private final Object[] values;
        private int idx;

        private Itr(Object[] values) {
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
}
