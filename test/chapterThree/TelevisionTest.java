package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    @Test
    public void televisionIsTurnedOnTest(){
        Television lg = new Television();
        lg.setOn(true);
        assertTrue(lg.powerOn());
    }

    @Test
    public  void televisionIsTurnedOffTest(){
        Television lg = new Television();
        lg.setOn(false);
        assertFalse(lg.powerOn());
    }

    @Test
    public void televisionChannelCanBeChangedTest(){
        Television lg = new Television();
        lg.setOn(true);
        lg.channelUp(20);
        assertEquals(21, lg.getCurrentChannel());
    }

    @Test
    public void televisionCanBeChangedToPreviousChannelTest(){
        Television lg = new Television();
        lg.setOn(true);
        lg.channelDown(12);
        assertEquals(11, lg.getCurrentChannel());
    }

    @Test
    public void televisionVolumeCanBeIncreasedTest(){
        Television lg = new Television();
        lg.setOn(true);
        lg.increaseVolume(2);
        assertEquals(3, lg.getTelevisionVolume());
    }

    @Test
    public void televisionVolumeCanBeDecreasedTest(){
        Television lg = new Television();
        lg.setOn(true);
        lg.decreaseVolume(1);
        assertEquals(0, lg.getTelevisionVolume());
    }

    @Test
    public void tvVolumeCannotBeIncreasedAbove100Test(){
        Television lg = new Television();
        lg.setOn(true);
        lg.increaseVolume(99);
        assertEquals(100, lg.getTelevisionVolume());
    }

    @Test
    public void tvChannelCannotBeIncreasedAbove100Test(){
        Television lg = new Television();
        lg.setOn(true);
        lg.channelUp(101);
        assertEquals(1, lg.getCurrentChannel());
    }

    @Test
    public void tvChannelCannotBeDecreasedBelow1Test(){
        Television lg = new Television();
        lg.setOn(true);
        lg.channelDown(0);
        assertEquals(100, lg.getCurrentChannel());
    }

    @Test
    public void tvRemainsInLastChannelTest(){
        Television lg = new Television();
        lg.setOn(false);
        lg.setOn(true);
        lg.lastChannel( 16);
        assertEquals(16, lg.getLastChannel());
    }


}