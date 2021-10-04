package ru.job4j.condition;

public class Max {
    public static int max(int numberOne, int numberTwo) {
        boolean maxOne = numberOne > numberTwo;
        return maxOne ? numberOne : numberTwo;
    }

    public static int max(int numberOne, int numberTwo, int numberThree) {
        return max(numberOne, max(numberTwo, numberThree));
    }

    public static int max(int numberOne, int numberTwo, int numberTree, int numberFour) {
        return max(numberOne, max(numberTwo, numberTree, numberFour));
    }
}
