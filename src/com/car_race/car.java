package com.car_race;


public class car extends vehicles {
    String[] names = {"Meridium", "Zeal", "Realm", "Paradox", "Vigor",
                        "Thunder", "Primade", "Inception", "Charm", "Portrait"};
    Boolean isSpeedLimited = false;

    private void setType(){

        type = "car";
    }

    public void setName(){

        setType();
        name = names[random.nextInt(10)] + names[random.nextInt(10)];
    }

    public void setSpeedLimit(int limit){
        if (limit <= 3){
            speed = 70;
            isSpeedLimited = true;
        }
    }

    private void setSpeed(){
        int randomSpeed = random.nextInt(4);
        if (randomSpeed == 0 && isSpeedLimited==false){
            speed = 80;
        }
        else if (randomSpeed == 1 && isSpeedLimited==false){
            speed = 90;
        }
        else if (randomSpeed == 2 && isSpeedLimited==false){
            speed = 100;
        }
        else if (randomSpeed == 3 && isSpeedLimited==false){
            speed = 110;
        }
    }

    public void moveForAnHour(){
        setSpeed();
        distanceTraveled += speed;
        isSpeedLimited=false;
    }

}
