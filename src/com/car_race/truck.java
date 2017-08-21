package com.car_race;


public class truck extends vehicles {
    Boolean truckTurnedDown = false;
    int breakdownTurnsLeft = 0;

    private void setType(){

        type = "truck";
    }

    public void setName(){

        setType();
        Integer randomName = new Integer(random.nextInt(1000));
        name = randomName.toString();
    }

    private void setSpeed(){
        speed = 100;
    }

    private void turnedDown(int accident) {
        System.out.println(name + "   " + accident);
        if (truckTurnedDown && breakdownTurnsLeft==1){
            truckTurnedDown = false;
            breakdownTurnsLeft = 0;
        }
        if (truckTurnedDown) {
            breakdownTurnsLeft++;
        }
        if (accident <= 5 && truckTurnedDown == false) {
            truckTurnedDown = true;
        }
    }
    public void moveForAnHour(){
        setSpeed();
        turnedDown(random.nextInt(100));
        if (truckTurnedDown==false) {
            distanceTraveled += speed;
        }
    }
}
