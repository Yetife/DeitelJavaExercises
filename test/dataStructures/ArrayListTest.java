package dataStructures;

import datastructures.ArrayList;
import datastructures.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    List myArrayList;
    @BeforeEach
    public void setUp()
    {

        myArrayList = new ArrayList();
    }

    @Test
    public void arrayListCanBeCreatedTest()
    {

        assertNotNull(myArrayList);
    }
    @Test
    public void newArrayListIsEmptyTest()
    {
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addElementArrayListShouldNotBeEmptyTest()
    {
        //whem
        myArrayList.add(34);
        //assert
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void addXRemoveX_ArrayListShouldBeEmptyTest()
    {
        myArrayList.add(34);
        myArrayList.remove(34);
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addXAndY_removeY_arrayShouldNotBeEmpty()
    {
        myArrayList.add(34);
        myArrayList.add(99);
        myArrayList.remove(99);
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void removeFromEmptyArrayList_shouldThrowanException()
    {
        assertThrows(IllegalArgumentException.class, () -> myArrayList.remove(34));
    }
    @Test
    public void addElement_arrayListSizeIncreases()
    {
        myArrayList.add(34);
       assertEquals(1, myArrayList.size());
    }

    @Test
    public void addElement_arrayListSizeIncreasesTest()
    {
        myArrayList.add(34);
        myArrayList.add(34);
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void replaceElementInArrayListTest()
    {
        myArrayList.add(34);
        myArrayList.add(64, 0);
        assertEquals(64, myArrayList.get(0));
    }

    @Test
    public void addThreeElement_getSecondByIndexTest()
    {
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(65);
        assertEquals(65, myArrayList.get(2));
    }
    @Test
    public void getIndexofElementTest()
    {
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        assertEquals(1, myArrayList.getIndexOf(32));
    }

    @Test
    public void arrayListElasticityTest()
    {
        assertEquals(3, myArrayList.getCapacity());
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        myArrayList.add(99);
        myArrayList.add(99);
        assertEquals(6, myArrayList.getCapacity());
        assertEquals(5, myArrayList.size());
        myArrayList.add(42);
        myArrayList.add(42);
        myArrayList.add(42);
        myArrayList.add(42);
        assertEquals(12, myArrayList.getCapacity());
        assertEquals(9, myArrayList.size());
    }

    @Test
    public void arrayIndexCanBeChangedWhenAnItemIsRemoved()
    {
        myArrayList.add(42);
        myArrayList.add(32);
        myArrayList.add(99);
        assertEquals(32,myArrayList.get(1));
        //when
        myArrayList.remove(32);
        assertEquals(99, myArrayList.get(1));
    }
    @Test
    public void insertANewElementAndTheOldOnesAreShiftedToTheRightForTheNewOne()
    {
        myArrayList.add(42,0);
        myArrayList.add(22,1);
        myArrayList.add(56,2);
//        myArrayList.insert()
    }
}