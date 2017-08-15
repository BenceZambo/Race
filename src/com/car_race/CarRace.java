package com.car_race;

import java.util.ArrayList;
import java.util.List;

public class CarRace {
    static List<car> cars = new ArrayList<car>();
    static List<truck> trucks = new ArrayList<truck>();
    static List<motorcycle> motorcycles = new ArrayList<motorcycle>();


    public static void main(String[] args) {

        createVehicles();
    }

    public static void createVehicles(){
        for (int i=1; i<11; i++){
            cars.add(new car());
        }

        for (int i=1; i<11; i++){
            trucks.add(new truck());
        }

        for (int i=1; i<11; i++){
            motorcycles.add(new motorcycle());
        }
    }
}
