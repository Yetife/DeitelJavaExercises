package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {


    @Test
    public void acCanBeTurnedOnTest() {
        // given
        AirConditioner lg = new AirConditioner(16);
        // assertFalse(lg.isOn());
        // when
        lg.setOn(true);
        // assert
        assertTrue(lg.isOn());

    }

    @Test
    public void acIsTurnedOffTest() {
        // given
        AirConditioner lg = new AirConditioner(16);
        lg.setOn(true);
        //assertTrue(lg.isOn());
        // when
        lg.setOn(false);
        // assert
        assertFalse(lg.isOn());

    }
    @Test
    public void acTemperatureCanBeIncreasedTest(){
        // given
        AirConditioner myAc = new AirConditioner(16);
        myAc.setOn(true);
        //when
        myAc.increaseTemperature();
        assertEquals(17, myAc.getCurrentTemperature());
    }

    @Test
        public void acTemperatureCanBeDecreasedTest(){
        // given
        AirConditioner myAc = new AirConditioner(17);
        myAc.setOn(true);
        // when
        myAc.decreaseTemperature();
        assertEquals(16, myAc.getCurrentTemperature());

    }

    @Test
    public void acCannotIncreaseBeyond30Test(){
        AirConditioner myAc = new AirConditioner(16);
        myAc.setOn(true);
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        assertEquals(30, myAc.getCurrentTemperature());
    }

    @Test
    public void acCannotDecreaseBelow16Test(){
        AirConditioner myAc = new AirConditioner(16);
        myAc.setOn(true);
        myAc.decreaseTemperature();
        assertEquals(16, myAc.getCurrentTemperature());
    }

}