package problem;

class Car {
    static int totalCars = 0;
    String brand;
    String model;
    int year;
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        totalCars++;
    }
    public void displayInfo() {
        System.out.println("Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year);
    }
    public static void displayTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }
}

class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", "Camry", 2020);
        cars[1] = new Car("Honda", "Civic", 2018);
        cars[2] = new Car("Ford", "Mustang", 2022);
        for (Car car : cars) {
            car.displayInfo();
        }
        Car.displayTotalCars();
    }
}

