package se.ecutb;

import java.util.Arrays;

public class IntArray implements IIntArray {
    private int[] numbers = new int[10];
    int currentIndex = 0;

    @Override
    public double getAverage() {
        double sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        if(currentIndex>0) {
            return sum / currentIndex;
        } else {
            return 0;
        }
    }

    @Override
    public int[] findPositions(int val) {
        int[] presentNumber = new int[0];
        for (int number: numbers) {
            if (number==val) {
                presentNumber = Arrays.copyOf(presentNumber, presentNumber.length+1);
                presentNumber[presentNumber.length-1] = number;
            }
        }
        return presentNumber;
    }

    @Override
    public void appendLast(int val) {
        if (currentIndex>numbers.length-1) {
            numbers = Arrays.copyOf(numbers, numbers.length+10);
        }
        if(numbers[currentIndex]==0) {
            numbers[currentIndex] = val;
        }
        currentIndex++;
    }

    @Override
    public void insertAt(int pos, int val) {
        if (numbers[pos]==0) {
            numbers[pos] = val;
        }
    }

    @Override
    public int getAt(int pos) {
        return numbers[pos];
    }

    @Override
    public void setAt(int pos, int element) {
        numbers[pos] = element;
    }

    @Override
    public int deleteAt(int pos) {
        int deletedNumber = numbers[pos];
        currentIndex--;
        return deletedNumber;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
