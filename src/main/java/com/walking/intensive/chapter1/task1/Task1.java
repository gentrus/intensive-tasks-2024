package com.walking.intensive.chapter1.task1;

/**
 * Реализуйте метод getAgeString(), который будет принимать параметром целое число (возраст) и возвращать строку
 * вида: "Вам N лет". Программа должна учитывать правила русского языка.
 *
 * <p>Пример верного исполнения кода: "Вам 5 лет", "Вам 4 года".
 * Пример неверной работы программы: "Вам 14 года".
 *
 * <p>Также необходимо учесть негативные сценарии. Например, попытку передать в метод невалидное значение - например,
 * отрицательное число. В таких случаях ожидается, что метод вернет строку "Некорректный ввод".
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 111;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int maxAge = 122;

        if (age <= 0 || age > maxAge) {
            return "Некорректный ввод";
        }

        if (age>10&&age<15) {
            return "Вам " + age + " лет";
        }

        if (age>100&&age<115) {
            return "Вам " + age + " лет";
        }

        if (age == 1 || (age % 10) == 1) {
            return "Вам " + age + " год";
        }

        if (age < 5 || age % 10 > 1 && age % 10 < 5) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}




