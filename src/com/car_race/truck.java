package com.car_race;

import java.util.Random;

public class truck extends vehicles {
    Random random = new Random();
    Boolean truckTurnedDown = false;
    int truckTurnedDownCounter = 0;

    public void setName(){
        Integer randomName = new Integer(random.nextInt(1000));
        name = randomName.toString();
    }

    private void setSpeed(){
        speed = 100;
    }

    public void turnedDown(int accident) {
        if (truckTurnedDown && truckTurnedDownCounter==2){
            truckTurnedDown = false;
        }
        if (truckTurnedDown) {
            truckTurnedDownCounter++;
        }
        if (accident <= 5 && truckTurnedDown == false) {
            truckTurnedDown = true;
        }
    }
    public void moveForAnHour(){
        turnedDown();
        if (truckTurnedDown==false) {
            distanceTraveled += speed;
        }
    }
}
