package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StackTest {
    public Stack stack;
    @BeforeEach
    public void startEachTestWithThis()
    {
        stack = new Stack(5);
    }
    @Test
    public void stackcanBeCreatedTest()
    {
        assertNotNull(stack);
    }

    @Test
    public void addXStackSizeIs1Test()
    {
        stack.push(3);
        assertEquals(1,stack.size());
    }
    @Test
    public void addXYStackSizeIs2Test()
    {
        stack.push(3);
        stack.push(6);
        assertEquals(2,stack.size());
    }
    @Test
    public void addXRemoveXStackShouldBeEmptyTest()
    {
        stack.push(3);
        stack.pop();
        assertEquals(0,stack.size());
        assertTrue(stack.isEmpty());
    }
    @Test
    public void removeFromEmptyStackThrowUnderFlowTest()
    {
        assertTrue(stack.isEmpty());
        assertThrows(Stack.UnderflowException.class, ()->stack.pop());
    }
    @Test
    public void addXPeekShowsXTest()
    {
        stack.push(4);
        stack.push(7);
        stack.push(2);
        stack.push(9);
        assertEquals(9, stack.peek());
    }

    @Test
    public void addXYZpopZY_XshouldBeatPeekTEst()
    {
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.pop();
        assertEquals(1,stack.size());
        assertEquals(4,stack.peek());
    }
    @Test
    public void addXYZABC_StackThrowsOverflowTest()
    {
        stack.push(43);
        stack.push(21);
        stack.push(21);
        stack.push(43);
        stack.push(43);
        assertThrows(Stack.OverFlowException.class, ()-> stack.push(31));
    }
    @Test
    public void peekEmptyStack_throwUnderflowTest()
    {
        assertThrows(Stack.UnderflowException.class, ()-> stack.peek());
    }
}
