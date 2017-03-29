package pkg05.objects.and.classess.Task2_Classes;

import java.util.Scanner;

public class Car {

    String category;
    String model;
    double horsePower;
    int yearManufacture;

    Car(String category, String model, double horsePower, int yearManufacture) {
        this.category = category;
        this.horsePower = horsePower;
        this.model = model;
        this.yearManufacture = yearManufacture;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String category = scanner.nextLine();
        String model = scanner.nextLine();
        int yearManufacture = scanner.nextInt();
        double horsePower = scanner.nextDouble();
        Car car = new Car(category, model, horsePower, yearManufacture);
        System.out.println(car.dutyRate());
    }

    public int insuranceCategory() {
        int currentYear = 2017 - yearManufacture;
        if (currentYear < 8) {
            return 1;
        } else if (currentYear < 15) {
            return 2;
        } else if (currentYear < 25) {
            return 3;
        } else {
            return 4;
        }
    }

    public double dutyRate() {
        double result = 0.0;
        if (insuranceCategory() == 1) {
            result = 150;
        } else if (insuranceCategory() == 2) {
            result = 200;
        } else if (insuranceCategory() == 3) {
            result = 300;
        } else {
            result = 500;
        }
        if (horsePower < 80) {
            result += result * 0.2;
        }
        if (horsePower > 140) {
            result += result * 0.45;
        }
        return result;
    }
}
