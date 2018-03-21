package idv.workshop.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class StackPracticeTest {

    private StackPractice stack;

    @Before
    public void init() {
        this.stack = new StackPractice(5);
    }

    @After
    public void destroy() {
        this.stack = null;
    }

    @Test
    public void testPush() {
        this.stack.push(1);
        this.stack.push(2);
        this.stack.push(3);

        assertEquals(3, this.stack.size());
    }

    @Test
    public void testPop() {
        this.stack.push(3);
        this.stack.push(2);
        this.stack.push(1);

        assertEquals(1, this.stack.pop());
        assertEquals(2, this.stack.pop());
        assertEquals(3, this.stack.pop());
    }

    @Test
    public void testPeek() {
        this.stack.push(7);

        assertEquals(7, this.stack.peek());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(this.stack.isEmpty());

        this.stack.push(1);

        assertFalse(this.stack.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(this.stack.isFull());

        this.stack.push(1);
        this.stack.push(2);
        this.stack.push(3);
        this.stack.push(4);
        this.stack.push(5);

        assertTrue(this.stack.isFull());
    }

    @Test
    public void testSize() {
        assertEquals(0, this.stack.size());

        this.stack.push(1);
        assertEquals(1, this.stack.size());
    }
}
