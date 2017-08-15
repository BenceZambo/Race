package com.car_race;

import java.util.Random;

public class car extends vehicles {
    String[] names = {"Meridium", "Zeal", "Realm", "Paradox", "Vigor",
                        "Thunder", "Primade", "Inception", "Charm", "Portrait"};
    Boolean isSpeedLimited = false;

    Random random = new Random();

    public void setname(){
        name = names[random.nextInt(10)] + names[random.nextInt(10)];
    }

    public void setSpeedLimit(int limit){
        if (limit <= 3){
            speed = 70;
        }
    }

    public void setSpeed(){
        int randomSpeed = random.nextInt(4);
        if (randomSpeed == 0 && isSpeedLimited){
            speed = 80;
        }
        else if (randomSpeed == 1 && isSpeedLimited){
            speed = 90;
        }
        else if (randomSpeed == 2 && isSpeedLimited){
            speed = 100;
        }
        else if (randomSpeed == 3 && isSpeedLimited){
            speed = 110;
        }
    }

    public void moveForAnHour(){
        setSpeed();
        distanceTraveled += speed;
    }

}
