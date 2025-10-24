package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Dealership dealership;
    Scanner scan;

    public UserInterface() {
       Scanner scan = new Scanner(System.in);
    }
    private void displayMenu() {
        System.out.println("\n=== " + dealership.getName() + " ===");
        System.out.println("1 - Find vehicles by price");
        System.out.println("2 - Find vehicles by make/model");
        System.out.println("3 - Find vehicles by year");
        System.out.println("4 - Find vehicles by color");
        System.out.println("5 - Find vehicles by mileage");
        System.out.println("6 - Find vehicles by type");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("99 - Quit");
        System.out.print("Enter your choice: ");
    }
    private void init() {
        DealershipFileManager manager = new DealershipFileManager();
        this.dealership = manager.getDealership();
        System.out.println("Loaded: " + dealership.getName());
    }
    public void display(){
        init();

        boolean running = true;
        while (running) {
            displayMenu();

            int choice = scan.nextInt();
            scan.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 99:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        scan.close();
    }
    private void displayVehicles(ArrayList<Vehicle> vehicles){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
    private void processAllVehiclesRequest() {
        ArrayList<Vehicle> vehicles = dealership.getAllVehicle();
        displayVehicles(vehicles);
    }

    private void processGetByPriceRequest() {

    }
    private void processGetByMakeModelRequest() {

    }
    private void processGetByYearRequest() {

    }
    private void processGetByColorRequest() {

    }
    private void processGetByMileageRequest() {

    }
    private void processGetByVehicleTypeRequest() {

    }
    private void processAddVehicleRequest() {

    }
    private void processRemoveVehicleRequest() {

    }
}




