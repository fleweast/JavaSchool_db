package lab1;

import lombok.Data;

import java.util.Arrays;

public class MySuperIntegerList implements SuperIntegerList {
    int[] myList;
    int curLength;
    int lastIndex;

    public MySuperIntegerList() {
        myList = new int[1];
        curLength = 1;
        lastIndex = 0;
    }



    @Override
    public void add(int number) {
        if (lastIndex >= curLength) {
            myList = Arrays.copyOf(myList, curLength * 2);
            curLength *= 2;
        }

        myList[lastIndex++] = number;
    }

    @Override
    public void removeByIndex(int index) {
        if (index >= lastIndex || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        System.arraycopy(myList, index + 1, myList, index, lastIndex - index);
        lastIndex--;
    }

    @Override
    public void removeByValue(int value) {
        for (int i = 0; i < lastIndex; i++) {
            if (myList[i] == value) {
                removeByIndex(i);
                i--;
            }
        }
    }

    @Override
    public int get(int index) {
        if (index >= lastIndex || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return myList[index];
    }

    @Override
    public void printAll() {
        for (int i = 0; i < lastIndex; i++) {
            System.out.print(myList[i] + " ");
        }
        System.out.println();
    }
}
