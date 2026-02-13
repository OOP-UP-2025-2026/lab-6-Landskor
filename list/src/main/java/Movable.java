package org.example;

// Інтерфейс Movable
interface Movable {
    void setX(double x);
    void setY(double y);
    double getX();
    double getY();
    void moveTo(double x, double y);
}

// Клас Point, який реалізує інтерфейс Movable
class Point implements Movable {
    private double x;
    private double y;

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Додатковий метод для виведення координат
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + "}";
    }
}
