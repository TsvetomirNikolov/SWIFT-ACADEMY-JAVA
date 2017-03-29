package pkg05.objects.and.classess.Task5_VehicleMonitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle {

    static int countLicenseNo = 0;
    private String type;
    private String model;
    private double power;
    private double fuelConsumption;
    private int yearProduced;
    private int licenseNo;
    private double distance;
    private double weight;
    private String colour = "N/A";

    Vehicle(String type, String model, int power, double fuelConsumption, int yearProduced) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.licenseNo = countLicenseNo++;
    }

    Vehicle(String type, String model, double power, double fuelConsumption, int yearProduced) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
    }

    Vehicle(String type, String model, double power, double fuelConsumption, int yearProduced, double distance, double weight) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.distance = distance;
        this.weight = weight;
        this.licenseNo = countLicenseNo++;
    }

    Vehicle(String type, String model, double power, double fuelConsumption, int yearProduced, double weight, String colour) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.weight = distance;
        this.colour = colour;
        this.licenseNo = countLicenseNo++;
    }

    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public int getYearProduced() {
        return this.yearProduced;
    }

    public double getWeight() {
        return this.weight;
    }

    int getLicenseNo() {
        return this.licenseNo;
    }

    String getColour() {
        return this.colour;
    }

    @Override
    public String toString() {
        return String.format(String.format("%04d - %s, %04d, %s \nInsurance cost: %.2f",
                getLicenseNo(), getModel(), getYearProduced(), getColour(), getInsurancePrice()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        double fuelPrice = Double.parseDouble(scanner.nextLine());
        double[] distance = new double[input];
        Vehicle[] vehicle = new Vehicle[input];
        for (int i = 0; i < input; i++) {
            String[] vehicleInfo = scanner.nextLine().split(", ");
            distance[i] = Double.parseDouble(vehicleInfo[5]);
            switch (vehicleInfo.length) {
                case 8:
                    vehicle[i] = new Vehicle(
                            vehicleInfo[0].trim(),
                            vehicleInfo[1].trim(),
                            Integer.parseInt(vehicleInfo[2].trim()),
                            Double.parseDouble(vehicleInfo[3].trim()),
                            Integer.parseInt(vehicleInfo[4].trim()),
                            Double.parseDouble(vehicleInfo[6].trim()),
                            vehicleInfo[7].trim());
                    break;
                case 6:
                    vehicle[i] = new Vehicle(
                            vehicleInfo[0].trim(),
                            vehicleInfo[1].trim(),
                            Integer.parseInt(vehicleInfo[2].trim()),
                            Double.parseDouble(vehicleInfo[3].trim()),
                            Integer.parseInt(vehicleInfo[4].trim()));
                    break;
            }

        }
        for (int i = 0; i < input; i++) {
            System.out.print(vehicle[i]);
            System.out.println(String.format(" - Travel cost: %.2f", vehicle[i].calculateTripPrice(fuelPrice, distance[i])));
        }
    }

    double calculateTripPrice(double fuelPrice, double distance) {
        double travelCost = (distance / 100) * this.fuelConsumption * fuelPrice;
        return travelCost;
    }

    double getInsurancePrice() {
        double insurance = 0.0;
        double carAge = 2016 - this.yearProduced;
        if (this.type.equals("car")) {
            insurance = (0.16 * this.power) * (1.25 * carAge) * (0.05 * this.fuelConsumption) * 1;
        } else if (this.type.equals("suv")) {
            insurance = (0.16 * this.power) * (1.25 * carAge) * (0.05 * this.fuelConsumption) * 1.12;
        } else if (this.type.equals("truck")) {
            insurance = (0.16 * this.power) * (1.25 * carAge) * (0.05 * this.fuelConsumption) * 1.20;
        } else {
            insurance = (0.16 * this.power) * (1.25 * carAge) * (0.05 * this.fuelConsumption) * 1.50;
        }
        return insurance;
    }
}
