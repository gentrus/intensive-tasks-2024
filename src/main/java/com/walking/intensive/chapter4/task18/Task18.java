package com.walking.intensive.chapter4.task18;

/**
 * Восемнадцатилетний Емеля едет в соседнюю деревню на печи искать себе невесту-ровесницу.
 * В каждой избушке в ряд живут невесты, каждая следующая старше
 * предыдущей на неизвестное количество лет. Будучи человеком ленивым и не желая заходить
 * в каждую избушку подряд и интересоваться возрастом невесты,
 * используя алгоритмическую сложность О(n), Емеля решил воспользоваться
 * алгоритмом бинарного поиска — это алгоритм поиска индекса нужного элемента (ключа)
 * в отсортированном массиве состоящим из неповторяющихся целых чисел путем деления массива на половины.
 *
 * <p>Реализуйте метод find(), используя алгоритм бинарного поиска. Суть алгоритма описана ниже.
 *
 * <p>Фактически, это последняя задача в интенсиве. Следующая глава содержит
 * еще два практических задания повышенной сложности - попробуйте свои силы,
 * но не стоит расстраиваться, если что-то не получится!
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task18 {
    public static void main(String[] args) {

    }

    /**
     * Метод вернет значение по индексу среднего индекса массива, если ключ совпадет с полученным значением.
     * Если ключ меньше значения, то поиск повторится в левой половине массива, иначе в правой.
     * Другая часть массива в поиске дальше не участвует.
     * Процесс продолжится до тех пор, пока не будет найдено искомое значение
     * или дробящийся массив не станет пустым.
     *
     * <p>Пример:
     *
     * <p>Входные данные: [1,2,5,7,12,13,18,49,56,72,106], 18
     *
     * <p>Возвращаемое значение: 18
     *
     * <p>Пояснение: Средний элемент с индексом 5 является число 13, которое меньше 18.
     * Левая половина массива отбрасывается, дальше в поиске участвует только
     * правый массив: [18,49,56,72,106]. Средний элемент 56 больше 18.
     * Останется массив [18,49]. Поскольку в данном массиве всего два элемента
     * и нет среднего для порядка будем округлять в меньшую сторону. Это элемент 18.
     *
     * <p>Сравнение эффективности алгоритмов:
     *
     * <ul>
     * <li>Если массив будет содержать 1024 элемент бинарный поиск справится с задачей
     *      за 11 сравнений (O(log(n))) против 1024 сравнений перебором O(n).
     * <li>Если массив будет содержать 1 000 000 элементов бинарный поиск справится с
     *      задачей за 21 сравнение (O(log(n))) против 1 000 000 сравнений перебором O(n).
     * </ul>
     */
    static int find(int[] girlAges, int targetAge) {
        if (girlAges.length == 0) {
            return -1;
        }
        if (girlAges.length <= 2) {
            if (girlAges[1] == targetAge) {
                return girlAges[1];
            }
            return girlAges[0];
        }

        int averageIndex = girlAges.length / 2;
        int cycleLenght = girlAges.length % 2 == 0 ? girlAges.length / 2 : girlAges.length / 2 + 1;
        int[] halfArr = new int[cycleLenght];

        if (girlAges[averageIndex] < targetAge) {
            for (int i = 0; i < halfArr.length; i++) {
                halfArr[i] = girlAges[i + averageIndex];
            }
        } else if (girlAges[averageIndex] > targetAge) {
            for (int i = 0; i < halfArr.length; i++) {
                halfArr[i] = girlAges[i];
            }
        } else {
            return girlAges[averageIndex];
        }

        return find(halfArr, targetAge);
    }
}
