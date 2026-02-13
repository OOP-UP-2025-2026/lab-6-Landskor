package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАВДАННЯ 1: Animal ===");
        Dog dog = new Dog("Бобік");
        Cat cat = new Cat("Мурка");
        System.out.println(dog.getName() + " каже: " + dog.makeSound());
        System.out.println(cat.getName() + " каже: " + cat.makeSound());

        System.out.println("\n=== ЗАВДАННЯ 2: Movable ===");
        Point point = new Point(3.5, 7.2);
        System.out.println("Початкова точка: " + point);
        point.moveTo(10.5, 20.7);
        System.out.println("Після moveTo: " + point);

        System.out.println("\n=== ЗАВДАННЯ 3: Smartphone ===");
        Smartphone phone = new Smartphone("Samsung S23", "+380991234567");
        phone.updateLocation(50.45, 30.52);
        phone.makeCall();
        phone.endCall();

        System.out.println("\n=== ЗАВДАННЯ 4: Car (Comparable) ===");
        Car car1 = new Car(15000, 2018, 150);
        Car car2 = new Car(12000, 2020, 130);
        Car car3 = new Car(15000, 2022, 140);
        Car car4 = new Car(15000, 2022, 160);

        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car3: " + car3);
        System.out.println("car4: " + car4);

        System.out.println("\nПорівняння:");
        System.out.println("car1.compareTo(car2): " + car1.compareTo(car2) + " (від'ємне = car1 < car2)");
        System.out.println("car2.compareTo(car1): " + car2.compareTo(car1) + " (додатнє = car2 > car1)");
        System.out.println("car1.compareTo(car3): " + car1.compareTo(car3));
        System.out.println("car3.compareTo(car4): " + car3.compareTo(car4));
    }
}