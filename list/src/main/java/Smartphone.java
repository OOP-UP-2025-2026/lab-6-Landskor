package org.example;

// Інтерфейс GPS
interface GPS {
    double[] getCoordinates();
}

// Інтерфейс Cellular
interface Cellular {
    void makeCall();
    void receiveCall();
}

// Клас Smartphone, який реалізує обидва інтерфейси
class Smartphone implements GPS, Cellular {
    private String model;
    private String phoneNumber;
    private double latitude;
    private double longitude;
    private boolean isCallActive;

    // Конструктор
    public Smartphone(String model, String phoneNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.isCallActive = false;
    }

    // Реалізація методу з інтерфейсу GPS
    @Override
    public double[] getCoordinates() {
        return new double[]{latitude, longitude};
    }

    // Метод для оновлення координат
    public void updateLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        System.out.println("📍 Місцезнаходження оновлено: " +
                latitude + ", " + longitude);
    }

    // Реалізація методу з інтерфейсу Cellular
    @Override
    public void makeCall() {
        if (!isCallActive) {
            isCallActive = true;
            System.out.println("📞 " + model + " (" + phoneNumber +
                    ") здійснює дзвінок...");
        } else {
            System.out.println("❌ Дзвінок вже активний");
        }
    }

    // Реалізація методу з інтерфейсу Cellular
    @Override
    public void receiveCall() {
        if (!isCallActive) {
            isCallActive = true;
            System.out.println("📲 " + model + " (" + phoneNumber +
                    ") отримує дзвінок...");
        } else {
            System.out.println("❌ Лінія зайнята");
        }
    }

    // Метод для завершення дзвінка
    public void endCall() {
        if (isCallActive) {
            isCallActive = false;
            System.out.println("🔚 Дзвінок завершено");
        } else {
            System.out.println("❌ Немає активного дзвінка");
        }
    }

    // Інформація про смартфон
    @Override
    public String toString() {
        String location = latitude + ", " + longitude;
        String callStatus = isCallActive ? "Активний" : "Не активний";
        return "📱 Smartphone{" +
                "модель='" + model + '\'' +
                ", номер='" + phoneNumber + '\'' +
                ", координати=(" + location + ")" +
                ", дзвінок=" + callStatus +
                '}';
    }
}
