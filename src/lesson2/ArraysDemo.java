package lesson2;

public class ArraysDemo {

    public static void main(String[] args) {
        // There are at least 2 ways to initialize an array

        // 1st one - initialize and assign all the values:
        String [] stringArray = {"Green", "Red", "Blue"};
        int [] intArray = {25, 35, 11, 55, 11111};
        short [] shortArray = {25, 35, 11, 55, 11111};
        boolean [] boolArray = {true, false, true, true, false};
        double [] doubleArray = {2.46, 3.25, 6.19, -24.667};

        // 2nd one - initialize with fixed size
        int [] arrayWithFixedSize = new int[5]; // length is specified in [] brackets
        int [] secondArrayWithFixedSize = new int[]{5}; // everything that is in {} brackets are values
        int [] thirdArrayWithFixedSize = {5}; // shortened way of ^^^

        System.out.println(stringArray.length);
        System.out.println(doubleArray.length);

        // indexing in array
        int selectedNumber = intArray[2]; // will return 11
        System.out.println(selectedNumber);

        // the following code will return an error as there are not element with such index
        // int secondSelectedNumber = intArray[intArray.length]; -> Exception

        int firstElement = intArray[0]; // to select firstelement

        int lengthOfIntArray = intArray.length;
        int lastElement = intArray[lengthOfIntArray - 1];
    }
}
