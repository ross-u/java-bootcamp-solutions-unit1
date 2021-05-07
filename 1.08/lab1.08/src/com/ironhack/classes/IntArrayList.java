package com.ironhack.classes;

public class IntArrayList implements IntList {
    private Integer[] array;

    public IntArrayList() {
        array = new Integer[10];
        System.out.println("init " + array.length);
    }

    public void add(int value) {
        boolean hasBeenAdded = false;

        // Iterate over the array
        for (int i=0; i<array.length; i++) {
            // Validate if has an empty position in the array
            if (array[i] == null) {
                array[i] = value;
                hasBeenAdded = true;
                break;
            }
        }

        // Validate if the item has been added
        if (!hasBeenAdded) {
            System.out.println("Update size " + array.length);

            // Calculate new length
            int newLength = array.length + array.length/2;

            // Create new array
            Integer[] newArray = new Integer[newLength];

            // Fill new array with old array values
            for (int i=0; i<array.length; i++) {
                newArray[i] = array[i];
            }

            // Override the array with newArray
            array = newArray;
        }

    }

    public int get(int id) {
        return array[id];
    }

}
