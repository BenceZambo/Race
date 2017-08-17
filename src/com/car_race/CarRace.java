package com.car_race;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRace {
    static Random random = new Random();
    static List<car> cars = new ArrayList<car>();
    static List<truck> trucks = new ArrayList<truck>();
    static List<motorcycle> motorcycles = new ArrayList<motorcycle>();


    public static void main(String[] args) {

        createVehicles();
        simulateRace();
        printRaceResults();
    }

    public static void printRaceResults(){
        for (int i = 0; i<cars.size();i++){
            System.out.println(cars.get(i).name + "   " +
                    cars.get(i).type + "   " +
                    cars.get(i).distanceTraveled);
        }
        for (int i = 0; i<cars.size();i++){
            System.out.println(trucks.get(i).name + "   " +
                    trucks.get(i).type + "   " +
                    trucks.get(i).distanceTraveled);
        }
        for (int i = 0; i<cars.size();i++){
            System.out.println(motorcycles.get(i).name + "   " +
                    motorcycles.get(i).type + "   " +
                    motorcycles.get(i).distanceTraveled);
        }
    }

    public static void simulateRace(){
        for (int hour = 1;hour <= 50; hour++) {
            for (int i = 0; i < cars.size(); i++) {
                int limit = random.nextInt(10);
                cars.get(i).setSpeedLimit(limit);
                cars.get(i).moveForAnHour();
            }
            for (int i = 0; i < trucks.size(); i++) {
                trucks.get(i).moveForAnHour();
            }
            for (int i = 0; i < motorcycles.size(); i++) {
                motorcycles.get(i).moveForAnHour(isRaining());
            }
        }
    }

    public static void createVehicles(){
        for (int i=1; i<11; i++){
            car testCar = new car();
            testCar.setName();
            cars.add(testCar);
        }

        for (int i=1; i<11; i++){
            truck testTruck = new truck();
            testTruck.setName();
            trucks.add(testTruck);
        }

        for (int i=1; i<11; i++){
            motorcycle testMotor = new motorcycle();
            testMotor.setName();
            motorcycles.add(testMotor);
        }
    }

    public static Boolean isRaining(){
        int rain;
        rain = random.nextInt(100);
        if (rain<=30){
            return true;
        }
        return false;
    }
}
