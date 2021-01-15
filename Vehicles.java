package Dealership;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vehicles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What car (model) are you looking for? ");

        String carModel = input.nextLine();

        //Create an empty HashMap
        HashMap<String, String> car = new HashMap<>();

        //Add care to our inventory
        car.put("GT","McLaren");
        car.put("Corvette Stingray","Chevy");
        car.put("Silverado","Chevy");
        car.put("Tahoe","Chevy");
        car.put("Suburban", "Chevy");
        car.put("Impala","Chevy");
        car.put("Blazer","Chevy");
        car.put("Cruze", "Chevy");
        car.put("Camaro", "Chevy");
        car.put("Volt","Chevy");
        car.put("Viper","Dodge");
        car.put("Avenger","Dodge");
        car.put("Challenger","Dodge");
        car.put("Charger", "Dodge");
        car.put("Edge","Ford");
        car.put("Mustang Shelby GT","Ford");
        car.put("F-150","Ford");
        car.put("Focus ST","Ford");
        car.put("Fusion", "Ford");
        car.put("Escape", "Ford");
        car.put("Flex","Ford");
        car.put("CR-V","Honda");
        car.put("Civic","Honda");
        car.put( "Odyssey", "Honda");
        car.put("Ridgeline","Honda");
        car.put("Accord","Honda");
        car.put("Pilot", "Honda");
        car.put("Outback","Subaru");
        car.put("Forester","Subaru");
        car.put("WRX","Subaru");
        car.put("BRZ","Subaru");
        car.put("Crosstrek","Subaru");
        car.put("RS Q8","Audi");
        car.put("RS5","Audi");
        car.put("A8","Audi");
        car.put("RS 7","Audi");
        car.put("S3","Audi");
        car.put("e-tron GT","Audi");
        car.put("SL65","Mercedes");
        car.put("SL55","Mercedes");
        car.put("SL550","Mercedes");
        car.put("SL450","Mercedes");
        car.put("GLS580","Mercedes");
        car.put("GLS450","Mercedes");
        car.put("GLS63","Mercedes");
        car.put("Sedona","Kia");
        car.put("Sportage","Kia");
        car.put("Telluride","Kia");
        car.put("Soul", "Kia");
        car.put("Forerunner","Toyota");
        car.put("Corrlla", "Toyota");


        //Filter out cars
        for (Map.Entry<String, String> mapent: car.entrySet()){
            String key = mapent.getKey();
            String value = mapent.getValue();
//            System.out.println(value + " " + key);
        }
        if(car.containsKey(carModel)){
            System.out.printf("\nOh, you're looking for a %s ? ", carModel );
            System.out.print(" Our selection is right over here.");
        } else {
            System.out.println("Unfortunately we don't have that model");
        }

    }
}
