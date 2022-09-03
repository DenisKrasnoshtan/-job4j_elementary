package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty() && !Character.isDigit(name.charAt(0))
                && !Character.isUpperCase(name.charAt(0));
        for (int i = 0; i < name.length(); i++) {
            if (!isSpecialSymbol(name.codePointAt(i))
                    && !isUpperLatinLetter(name.codePointAt(i))
                    && !isLowerLatinLetter(name.codePointAt(i))
                    && !Character.isDigit(name.codePointAt(i))) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 95;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
