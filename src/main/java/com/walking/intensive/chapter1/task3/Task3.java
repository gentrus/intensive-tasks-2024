package com.walking.intensive.chapter1.task3;

/**
 * Тропический год, это время реального обращения земли вокруг солнца. T = 365 дней, 5 часов, 48 минут, 45 секунд.
 *
 * <p>То есть, если не учитывать погрешность примерно в 6 часов в год,
 * то со временем месяцы будут сдвигаться относительно времен года.
 * Для балансировки придумано 29 февраля каждый 4 год.
 *
 * <p>Каждые 100 лет набегает новая погрешность, связанная уже с использованием 6 часов, и тогда год невисокосный.
 *
 * <p>Каждые 400 лет набегает новая погрешность, год снова високосный.
 *
 * <p><p>Реализуйте метод isLeap(), который принимает параметром год и отвечает на вопрос: является ли год високосным?
 *
 * <p>Таким образом для високосного года метод должен вернуть true, для не високосного - false.
 *
 * <p>Если переданное в метод значение некорректно - метод также должен вернуть false.
 *
 * <p>P.S. Наиболее пытливые из вас могут вспомнить, что Григорианский календарь был принят лишь в 1582 году,
 * вследствие чего содержит некоторые специфические коллизии для 1582 года и предыдущих лет.
 * В пределах задачи эти отличия можно игнорировать.
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task3 {
    public static void main(String[] args) {

        System.out.println(isLeap(404));

    }

    static boolean isLeap(int year) {
        if (year <= 0) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        } else {
            return false;
        }

    }
}
