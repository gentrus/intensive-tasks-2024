package com.walking.intensive.chapter2.task10;

/**
 * Реализуйте метод isPalindrome(), который проверяет, является ли строка палиндромом.
 *
 * <p>Метод должен игнорировать пунктуацию, пробелы и регистр.
 *
 * <p>P.S. Мой любимый палиндром: Муза! Ранясь шилом опыта, ты помолишься на разум.
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task10 {
    public static void main(String[] args) {

    }

    static boolean isPalindrome(String inputString) {
        if (inputString==null||inputString.length()<2) {
            return false;
        }

        int letterNumb2 = inputString.length() - 1;
        for (int letterNumb1 = 0; letterNumb1 < inputString.length() / 2; ) {
            char letter1 = inputString.charAt(letterNumb1);
            while (letter1 == ' ' || letter1 == '?' || letter1 == '!' || letter1 == ',' || letter1 == '-') {
                letterNumb1++;
                letter1 = inputString.charAt(letterNumb1);
            }
            char letter2 = inputString.charAt(letterNumb2);
            while (letter2 == ' ' || letter2 == '?' || letter2 == '!' || letter2 == ',' || letter2 == '-') {
                letterNumb2--;
                letter2 = inputString.charAt(letterNumb2);
            }

            if (Character.toUpperCase(letter1) != Character.toUpperCase(letter2)) {
                return false;
            }
            letterNumb1++;
            letterNumb2--;
        }

        return true;
    }
}