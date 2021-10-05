package mpThreePlayer;

public class Mp3Player {
private  boolean isOn;
private boolean isPlaying;
private int volume;

    public boolean isOn()
    {
        return isOn;
    }

    public void setOn(boolean isOn)
    {
        this.isOn = isOn;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlay(boolean play) {
        isPlaying = play;
    }

    public int volume()
    {
        return volume;
    }

    public void volumeUp()
    {
        if(volume < 100){
            volume = volume + 5;
        }
    }
    public void volumeDown()
    {
        if(volume > 0){
            volume = volume - 5;
        }
    }
}
