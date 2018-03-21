package idv.workshop.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class CircularQueuePracticeTest {
    private CircularQueuePractice circularQueue;

    @Before
    public void init() {
        circularQueue = new CircularQueuePractice(5);
    }

    @After
    public void destroy() {
        circularQueue = null;
    }

    @Test
    public void testInsert() {
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        assertEquals(3, circularQueue.getElementCount());
        circularQueue.insert(4);
        circularQueue.insert(5);
        assertEquals(5, circularQueue.getElementCount());

        circularQueue.insert(6);
        circularQueue.insert(7);
        assertEquals(5, circularQueue.getElementCount());
    }

    @Test
    public void testRemove() {
        circularQueue.insert(1);
        circularQueue.insert(2);
        assertEquals(2, circularQueue.getElementCount());
        circularQueue.remove();
        assertEquals(1,circularQueue.getElementCount());
        circularQueue.remove();
        assertEquals(0, circularQueue.getElementCount());
    }

    @Test
    public void testPeek() {
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        assertEquals(1, circularQueue.peek());  //先進先出
        circularQueue.remove();
        assertEquals(2, circularQueue.peek());
        assertEquals(2, circularQueue.getElementCount());
    }

    @Test
    public void testIsEmpty() {
        circularQueue.insert(1);
        assertFalse(circularQueue.isEmpty());
        circularQueue.remove();
        assertTrue(circularQueue.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(circularQueue.isFull());

        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(5);

        assertTrue(circularQueue.isFull());
    }

    @Test
    public void testCircular() {
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(5);
        assertEquals(5, circularQueue.getElementCount());
        assertEquals(1, circularQueue.peek());

        circularQueue.insert(6);
        circularQueue.insert(7);
        assertEquals(5, circularQueue.getElementCount());
        assertEquals(6, circularQueue.peek());

        assertEquals(6, circularQueue.remove());
        assertEquals(7, circularQueue.remove());
        assertEquals(3, circularQueue.remove());
        assertEquals(4, circularQueue.remove());
        assertEquals(5, circularQueue.remove());
    }
}
