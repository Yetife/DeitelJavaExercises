package chapterThree;

public class AirConditioner {

    private boolean isOn;
    private int currentTemperature;

    public AirConditioner(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {

        return isOn;
    }

    public void setOn(boolean isOn) {

        this.isOn = isOn;
    }


    public void increaseTemperature() {
        if ( currentTemperature < 30) {
            currentTemperature = currentTemperature + 1;
        }
    }


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void decreaseTemperature() {
        if (currentTemperature > 16) {
            currentTemperature = currentTemperature - 1;
        }
    }
}
