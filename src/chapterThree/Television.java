package chapterThree;

public class Television {
    private boolean powerOn;
    private int channel;
    private int volume;
    private int lastChannel;

    public void setOn(boolean tvOn) {
    powerOn = tvOn;
    }

    public boolean powerOn() {
        return powerOn;
    }

    public void channelUp(int tvChannel) {
        if (tvChannel > 1){
            channel = tvChannel + 1;
        }
        if (tvChannel > 100) {
            channel = tvChannel - 100;
        }
    }

    public int getCurrentChannel() {
        return channel;
    }

    public void channelDown(int tvChannel) {
        if (tvChannel < 100) {
            channel = tvChannel - 1;
        }
        if (tvChannel < 1){
            channel = tvChannel + 100;
        }
    }
    public void increaseVolume(int tvVolume) {
        if (tvVolume < 100) {
            volume = tvVolume + 1;
        }
    }

    public int getTelevisionVolume() {
        return volume;
    }

    public void decreaseVolume(int tvVolume) {
        volume = tvVolume -1;
    }

    public void lastChannel(int lastTvChannel) {
        lastChannel = lastTvChannel;
    }

    public int getLastChannel() {
        return lastChannel;
    }
}
