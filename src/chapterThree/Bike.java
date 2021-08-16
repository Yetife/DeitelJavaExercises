package chapterThree;

public class Bike {
    private boolean hasOn;
    private int currentSpeed;
    private int gear;

    public boolean hasOn() {

        return hasOn;
    }

    public void setOn(boolean hasOn) {

        this.hasOn = hasOn;
    }

    public void accelerate(int speed) {
        if (gear == 1) {
            currentSpeed = speed + 1;
        }
        if (gear == 2) {
            currentSpeed = speed + 2;
        }
        if (gear == 3) {
            currentSpeed = speed + 3;
        }
        if (gear == 4) {
            currentSpeed = speed + 4;
        }
    }
    public int getCurrentSpeed() {

        return currentSpeed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void decelerate(int speed) {
        if (gear == 1){
            currentSpeed = speed - 1;
        }
        if (gear == 2){
            currentSpeed = speed - 2;
        }
        if (gear == 3){
            currentSpeed = speed - 3;
        }
        if (gear == 4){
            currentSpeed = speed - 4;
        }
    }

    public void accelerateGear(int speed) {
        if (speed >= 0 && speed <= 20){
            gear = 1;
        }
        if (speed >= 21 && speed <= 30){
            gear = 2;
        }
        if (speed >= 31 && speed <= 40){
            gear = 3;
        }
        if (speed >= 41 && speed <= 100){
            gear = 4;
        }

    }

    public int getGear() {
        return gear;
    }
}
