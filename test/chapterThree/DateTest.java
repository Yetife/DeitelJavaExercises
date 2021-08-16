package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    public void testThatMonthOfDateCanBeSet(){
        Date date = new Date();
        date.month(6);
        assertEquals(6, date.getMonth());
    }

    @Test
    public void testThatMonthOfDateCannotBeNegative(){
        Date date = new Date();
        date.month(-6);
        assertEquals(0, date.getMonth());
    }

    @Test
    public void testThatMonthOfDateCannotExceed12(){
        Date date = new Date();
        date.month(13);
        assertEquals(0, date.getMonth());
    }

    @Test
    public void testThatDayOfDateCanBeSet(){
        Date date = new Date();
        date.day(16);
        assertEquals(16, date.getDay());
    }
    @Test
    public void testThatDayOfDateCannotBeNegative(){
        Date date = new Date();
        date.day(-16);
        assertEquals(0, date.getDay());
    }
    @Test
    public void testThatDayOfDateCannotExceed31(){
        Date date = new Date();
        date.day(32);
        assertEquals(0, date.getDay());
    }

    @Test
    public void testThatMonthFebruaryCannotExceed30(){
        Date date = new Date();
        date.month(2);
        date.day(30);
        date.year(2020);

        assertEquals(0, date.getDay());
    }

    @Test
    public void testThatMonthAprilJuneSeptemberNovemberCannotExceed30(){
        Date date = new Date();
        date.month(4);
        date.day(31);
        date.year(2021);
        assertEquals(0, date.getDay());
    }

    @Test
    public void testThatYearOfDateCanBeSet(){
        Date date = new Date();
        date.year(2021);
        assertEquals(2021, date.getYear());
    }

    @Test
    public void testThatYearOfDateCannotBeNegative(){
        Date date = new Date();
        date.month(-2021);
        assertEquals(0, date.getYear());
    }

    @Test
    public void testThatYearOfDateCannotExceed2021(){
        Date date = new Date();
        date.year(2022);
        assertEquals(0, date.getYear());
    }



    @Test
    public void testThatYearOfDateCannotRecede1900(){
        Date date = new Date();
        date.year(1900);
        assertEquals(1900, date.getYear());
    }

    @Test
    public void displayDateTest(){
        Date date = new Date();
        date.day(16);
        date.month(6);
        date.year(2021);
        assertEquals("16/6/2021", date.getDisplayDate());
    }



}