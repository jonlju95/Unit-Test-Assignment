package se.ecutb;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayTest {
    IntArray testArray;

    @BeforeEach
    void setUp() {
        testArray = new IntArray();
    }

    @Test
    void getAverage() {
        testArray.appendLast(2);
        testArray.appendLast(3);
        testArray.appendLast(4);
        assertEquals(3, testArray.getAverage());
    }

    @Test
    void findPositions() {
        testArray.appendLast(2);
        testArray.appendLast(3);
        testArray.appendLast(4);
        testArray.appendLast(5);
        testArray.appendLast(6);
        testArray.appendLast(4);
        assertEquals(2, testArray.findPositions(4).length);
    }

    @Test
    void appendLast() {
        testArray.appendLast(2);
        assertEquals(2, testArray.getNumbers()[0]);
        testArray.appendLast(3);
        testArray.appendLast(4);
        testArray.appendLast(5);
        testArray.appendLast(6);
        testArray.appendLast(4);
        testArray.appendLast(2);
        testArray.appendLast(3);
        testArray.appendLast(4);
        testArray.appendLast(5);
        testArray.appendLast(6);
        testArray.appendLast(4);
        assertTrue(testArray.getNumbers().length>10);
    }

    @Test
    void insertAt() {
        testArray.appendLast(6);
        testArray.appendLast(4);
        testArray.insertAt(1, 5);
        assertEquals(4,testArray.getNumbers()[1]);
        testArray.insertAt(4, 10);
        assertEquals(10,testArray.getNumbers()[4]);
    }

    @Test
    void getAt() {
        testArray.appendLast(6);
        testArray.appendLast(4);
        assertEquals(6, testArray.getAt(0));
    }

    @Test
    void setAt() {
        testArray.appendLast(1);
        testArray.appendLast(2);
        testArray.setAt(1, 4);
        assertEquals(4,testArray.getNumbers()[1]);
    }

    @Test
    void deleteAt() {
        testArray.appendLast(1);
        testArray.appendLast(2);
        assertEquals(2, testArray.deleteAt(1));
    }

    @Test
    void getNumbers() {
        testArray.appendLast(1);
        testArray.appendLast(2);
        testArray.appendLast(3);
        assertEquals(10, testArray.getNumbers().length);
    }
}