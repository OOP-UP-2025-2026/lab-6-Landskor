package org.example;
// Абстрактний клас Animal (створюємо його)
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String makeSound();
}

// Клас Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Гав-гав!";
    }
}

// Клас Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Мяу-мяу!";
    }
}
