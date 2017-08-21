package com.car_race;


public class motorcycle extends vehicles {
    static int numberOfBikers = 0;

    private void setType(){

        type = "motorcycle";
    }

    public void setName(){

        setType();
        numberOfBikers++;
        name = "Motorcycle" + numberOfBikers;
    }

    private void setSpeed(){
        speed = 100;
    }

    public void moveForAnHour(Boolean isRaining){
        setSpeed();
        if (isRaining){
            int x = random.nextInt(10);
            x *= 5;
            speed -= x;
        }
        distanceTraveled += speed;
    }
}
