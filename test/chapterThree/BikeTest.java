package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void bikeCanBeTurnedOnTest(){
        Bike myBike = new Bike();
        myBike.hasOn();
        myBike.setOn(true);
        assertTrue(myBike.hasOn());
    }

    @Test
    public void bikeCanIsTurnedOffTest(){
        Bike myBike = new Bike();
        myBike.setOn(false);
        assertFalse(myBike.hasOn());
    }


@Test
public void bikeCanBeAcceleratedOnGearOneTest(){
   // given
    Bike myBike = new Bike();
    myBike.setOn(true);
    myBike.setGear(1);
    // when
    myBike.accelerate(16);
    assertEquals(17, myBike.getCurrentSpeed());

}

@Test
public void bikeCanBeAcceleratedOnGearTwoTest(){
    // given
    Bike myBike = new Bike();
    myBike.setOn(true);
    myBike.setGear(2);
    // when
    myBike.accelerate(20);
    assertEquals(22, myBike.getCurrentSpeed());

}

@Test
public void bikeCanBeAcceleratedOnGearThreeTest(){
    // given
    Bike myBike = new Bike();
    myBike.setOn(true);
    myBike.setGear(3);
    // when
    myBike.accelerate(22);
    assertEquals(25, myBike.getCurrentSpeed());

}

@Test
public void bikeCanBeAcceleratedOnGearFourTest(){
    // given
    Bike myBike = new Bike();
    myBike.setOn(true);
    myBike.setGear(4);
    // when
    myBike.accelerate(25);
    assertEquals(29, myBike.getCurrentSpeed());

}

@Test
    public void bikeCanBeDeceleratedOnGearOneTest(){
        Bike myBike = new Bike();
        myBike.setOn(true);
        myBike.setGear(1);
        myBike.decelerate(30);
        assertEquals(29, myBike.getCurrentSpeed());
}

@Test
public void bikeCanBeDeceleratedOnGearTwoTest(){
    Bike myBike = new Bike();
    myBike.setOn(true);
    myBike.setGear(2);
    myBike.decelerate(29);
    assertEquals(27, myBike.getCurrentSpeed());
}

@Test
public void bikeCanBeDeceleratedOnGearThreeTest(){
    Bike myBike = new Bike();
    myBike.setOn(true);
    myBike.setGear(3);
    myBike.decelerate(27);
    assertEquals(24, myBike.getCurrentSpeed());
}
@Test
public void bikeCanBeDeceleratedOnGearFourTest(){
        Bike myBike = new Bike();
        myBike.setOn(true);
        myBike.setGear(4);
        myBike.decelerate(24);
        assertEquals(20, myBike.getCurrentSpeed());
    }

@Test
public void bikeCanChangeGearAutomaticallyOneTest(){
        Bike myBike = new Bike();
        myBike.accelerateGear(20);
        assertEquals(1, myBike.getGear());
}

@Test
public void bikeCanChangeGearAutomaticallyTwoTest(){
    Bike myBike = new Bike();
    myBike.accelerateGear(30);
    assertEquals(2, myBike.getGear());
}

@Test
public void bikeCanChangeGearAutomaticallyThreeTest(){
    Bike myBike = new Bike();
    myBike.accelerateGear(40);
    assertEquals(3, myBike.getGear());
}

@Test
public void bikeCanChangeGearAutomaticallyFourTest(){
    Bike myBike = new Bike();
    myBike.accelerateGear(50);
    assertEquals(4, myBike.getGear());
}
    }
