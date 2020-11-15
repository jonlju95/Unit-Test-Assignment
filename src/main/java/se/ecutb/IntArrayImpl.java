package se.ecutb;

import java.util.Arrays;

public class IntArrayImpl {
    static IntArray intArray = new IntArray();

    public static void main(String[] args) {
        intArray.appendLast(5);
        intArray.appendLast(3);
        intArray.appendLast(7);
        intArray.appendLast(7);
        System.out.println(Arrays.toString(intArray.findPositions(7)));
    }
}
