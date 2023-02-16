package org.itstep.practice;

public class Practice {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes S6", 120_000);
        Car tesla = new Car("Tesla X", 45_000);
        Car bmw = new Car("BMW X6", 55_000);
        CarShop carShop = new CarShop("Supe Cars");

        // 1. Додати в клас CarShop метод add() для додавання автомобілів
        // 2. Імплементувати методи інтерфейсу Iterable в класі CarShop
        // 3. Створити вкладений статичний класс, що успадковується від Iterator
        // всередині CarShop і дозволяє ітерувати масив авто
        // 4. Розкоментувати нижченаведений код і перевірити, що він відпрацьовує коректно
        

            carShop.add(mercedes, tesla, bmw);

            for(Object car: carShop) {
                System.out.println(car);
             }

    }
}
