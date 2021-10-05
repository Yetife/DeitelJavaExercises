package mpThreePlayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {
    Mp3Player sony;
    @BeforeEach
    public void beforeEach()
    {
        sony = new Mp3Player();
    }

    @Test
    public void mpThreePlayerCanBeTurnedOnTest()
    {
        assertFalse(sony.isOn());
        sony.setOn(true);
        assertTrue(sony.isOn());
    }

    @Test
    public void mpThreePlayerCanBeTurnedOffTest()
    {
        sony.setOn(true);
        assertTrue(sony.isOn());
        sony.setOn(false);
        assertFalse(sony.isOn());
    }

    @Test
    public void mpThreePlayerCanPlayMusicTest()
    {
        sony.setOn(true);
        sony.setPlay(true);
        assertTrue(sony.isPlaying());
    }

    @Test
    public void mpThreePlayerCanIncreaseVolumeTest()
    {
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        assertEquals(20, sony.volume());
    }
    @Test
    public void mpThreePlayerCannotIncreaseVolumeBeyond100Test()
    {
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        assertEquals(100, sony.volume());
    }
    @Test
    public void mpThreePlayerCanDecreaseVolumeTest()
    {
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeDown();
        assertEquals(15, sony.volume());
    }
    @Test
    public void mpThreePlayerCannotDecreaseBeyond0Test()
    {
        sony.volume();
        sony.volumeDown();
        sony.volumeDown();
        assertEquals(0, sony.volume());
    }




}