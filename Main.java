package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Provides an array list to hold the integers
        List<Integer> numList = new ArrayList<>(5);

        //Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<String, Integer> mathOperationsMap = new HashMap<>();

        System.out.println("We can print to the console");
        int counter;
        int maxNum = 5;
        String message1 = "Please enter the number for position ";
        int numResult;


        for (int i = 0; i < maxNum; i++) {
            counter = loopArrays.getInputNumber((message1 + i));    // getInputNumber((message1 + i));
            numList.add(counter);

        }

        numResult = 0;
        // Calculate the sum of the arraylist
        for (Integer integer : numList) {
            numResult = numResult + integer;
//            System.out.println(numResult);
        }

        // put the sum in the hashmap
        mathOperationsMap.put("Sum", numResult);

        numResult = 1;
        // Calculate the product of the arraylist
        for (Integer integer : numList) {
            numResult = numResult * integer;
//            System.out.println(numResult);
        }

        // put the product in the hashmap
        mathOperationsMap.put("Product", numResult);
//        System.out.println(mathOperationsMap);

        int maxBig = Collections.max(numList);
        mathOperationsMap.put("Largest", maxBig);
//        System.out.println(mathOperationsMap);

        int minSmall = Collections.min(numList);
        mathOperationsMap.put("Smallest", minSmall);
        System.out.println(mathOperationsMap);


    }
}
