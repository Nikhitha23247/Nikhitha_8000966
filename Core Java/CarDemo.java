class Car {

    String make;
    String model;
    int year;

    // method to display car details
    void displayDetails() {

        System.out.println("Car Make  : " + make);
        System.out.println("Car Model : " + model);
        System.out.println("Car Year  : " + year);

        System.out.println();
    }
}

public class CarDemo {

    public static void main(String[] args) {

        // first car object
        Car car1 = new Car();

        car1.make = "Hyundai";
        car1.model = "Creta";
        car1.year = 2022;

        // second car object
        Car car2 = new Car();

        car2.make = "Honda";
        car2.model = "City";
        car2.year = 2021;

        // displaying details
        car1.displayDetails();

        car2.displayDetails();
    }
}