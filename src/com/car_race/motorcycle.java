package com.car_race;

import java.util.Random;

public class motorcycle extends vehicles {
    static int numberOfBikers = 0;
    Random random = new Random();

    public void setName(){
        numberOfBikers++;
        name = "Motorcycle" + numberOfBikers;
    }

    public void setSpeed(){
        speed = 100;
    }

    public void moveForAnHour(Boolean isRaining){
        if (isRaining){
            int x = random.nextInt(10);
            x *= 5;
            speed -= x;
        }
        distanceTraveled += speed;
    }
}
