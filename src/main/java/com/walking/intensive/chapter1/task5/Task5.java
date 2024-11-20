package com.walking.intensive.chapter1.task5;

/**
 * Задача поиска площади, величин углов, длин высот, биссектрис, медиан, радиусов вписанной и описанной вокруг
 * треугольника окружностей является центральной в Геометрии.
 *
 * <p>Реализуйте представленные ниже методы в соответствии с заданными условиями.
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
    }

    /**
     * Частным случаем Tеоремы Брахмагупты является формула Герона.
     *
     * <p>Реализуйте метод поиска площади треугольника формулой Герона.
     *
     * <p>Входные параметры - длина сторон треугольника. Возвращаемое значение - площадь треугольника.
     *
     * <p>Если входные данные некорректны - метод должен возвращать -1.
     */
    static double getAreaByHeron(double a, double b, double c) {
        if ((a <= 0 || b <= 0 || c <= 0) || ((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return -1;
        }
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));

    }

    /**
     * Реализуйте метод, который будет возвращать высоты треугольника по возрастанию.
     *
     * <p>Входные параметры - длина сторон треугольника. Возвращаемое значение - массив с высотами треугольника.
     *
     * <p>Если входные данные некорректны - метод должен возвращать пустой массив нулевой длины.
     */
    static double[] getHeights(double a, double b, double c) {
        double[] height;
        double maxHeight;
        double middleHeight;
        double minHeight;

        if ((a <= 0 || b <= 0 || c <= 0) || ((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return height = new double[0];
        }
        height = new double[3];

        // находим высоты
        double height1 = (2 * getAreaByHeron(a, b, c)) / a;
        double height2 = (2 * getAreaByHeron(a, b, c)) / b;
        double height3 = (2 * getAreaByHeron(a, b, c)) / c;

        // распологаем по возрастанию
        maxHeight = Math.max(height1, height2);
        maxHeight = Math.max(maxHeight, height3);

        minHeight = Math.min(height1, height2);
        minHeight = Math.min(minHeight, height3);

        middleHeight = (height1 + height2 + height3) - (maxHeight + minHeight);


        return height = new double[]{minHeight, middleHeight, maxHeight};

    }

    /**
     * Реализуйте метод, который будет возвращать медианы треугольника по возрастанию.
     *
     * <p>Входные параметры - длина сторон треугольника. Возвращаемое значение - массив с медианами треугольника.
     *
     * <p>Если входные данные некорректны - метод должен возвращать пустой массив нулевой длины.
     */
    static double[] getMedians(double a, double b, double c) {

        double[] medians;
        double maxMedian;
        double middleMedian;
        double minMedian;

        if ((a <= 0 || b <= 0 || c <= 0) || ((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return medians = new double[0];
        }
        medians = new double[3];

        // находим высоты
        double median1 = (Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(b, 2) - Math.pow(a, 2))) / 2;
        double median2 = (Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(a, 2) - Math.pow(b, 2))) / 2;
        double median3 = (Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2))) / 2;

        // распологаем по возрастанию
        maxMedian = Math.max(median1, median2);
        maxMedian = Math.max(maxMedian, median3);

        minMedian = Math.min(median1, median2);
        minMedian = Math.min(minMedian, median3);

        middleMedian = (median1 + median2 + median3) - (maxMedian + minMedian);


        return medians = new double[]{minMedian, middleMedian, maxMedian};

    }


    /**
     * Реализуйте метод, который будет возвращать биссектрисы треугольника по возрастанию.
     *
     * <p>Входные параметры - длина сторон треугольника. Возвращаемое значение - массив с биссектрисами треугольника.
     *
     * <p>Если входные данные некорректны - метод должен возвращать пустой массив нулевой длины.
     */
    static double[] getBisectors(double a, double b, double c) {

        double[] bisectors;
        double maxBisector;
        double middleBisector;
        double minBisector;

        if ((a <= 0 || b <= 0 || c <= 0) || ((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return bisectors = new double[0];
        }
        bisectors = new double[3];

        // находим высоты
        double bisectors1 = (Math.sqrt(a * b * (a + b + c) * (a + b - c))) / (a + b);
        double bisectors2 = (Math.sqrt(b * c * (b + c + a) * (b + c - a))) / (b + c);
        double bisectors3 = (Math.sqrt(c * a * (c + a + b) * (c + a - b))) / (c + a);

        // распологаем по возрастанию
        maxBisector = Math.max(bisectors1, bisectors2);
        maxBisector = Math.max(maxBisector, bisectors3);

        minBisector = Math.min(bisectors1, bisectors2);
        minBisector = Math.min(minBisector, bisectors3);

        middleBisector = (bisectors1 + bisectors2 + bisectors3) - (maxBisector + minBisector);


        return bisectors = new double[]{minBisector, middleBisector, maxBisector};

    }

    /**
     * Реализуйте метод, который будет возвращать углы треугольника (в градусах) по возрастанию.
     *
     * <p>Входные параметры - длина сторон треугольника. Возвращаемое значение - массив с углами треугольника.
     *
     * <p>Если входные данные некорректны - метод должен возвращать пустой массив нулевой длины.
     */
    static double[] getAngles(double a, double b, double c) {

        double[] angles;
        double maxAngle;
        double middleAngle;
        double minAngle;

        if ((a <= 0 || b <= 0 || c <= 0) || ((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return angles = new double[0];
        }
        angles = new double[3];

        // находим высоты
        double angle1 = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
        double angle2 = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) / (2 * c * a)));
        double angle3 = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));

        // распологаем по возрастанию
        maxAngle = Math.max(angle1, angle2);
        maxAngle = Math.max(maxAngle, angle3);

        minAngle = Math.min(angle1, angle2);
        minAngle = Math.min(minAngle, angle3);

        middleAngle = (angle1 + angle2 + angle3) - (maxAngle + minAngle);


        return angles = new double[]{minAngle, middleAngle, maxAngle};


    }

    /**
     * Реализуйте метод, который будет возвращать длину радиуса вписанной в треугольник окружности.
     *
     * <p>Входные параметры - длина сторон треугольника.
     *
     * <p>Если входные данные некорректны - метод должен возвращать -1.
     */
    static double getInscribedCircleRadius(double a, double b, double c) {
        if ((a <= 0 || b <= 0 || c <= 0) || ((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return -1;
        }

        return getAreaByHeron(a, b, c) / ((a + b + c) / 2);
    }

    /**
     * Реализуйте метод, который будет возвращать длину радиуса описанной вокруг треугольника окружности.
     *
     * <p>Входные параметры - длина сторон треугольника.
     *
     * <p>Если входные данные некорректны - метод должен возвращать -1.
     */
    static double getCircumradius(double a, double b, double c) {
        if ((a <= 0 || b <= 0 || c <= 0) || ((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return -1;
        }
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    /**
     * Дополнительная задача по желанию.
     *
     * <p>Реализуйте метод, который будет возвращать площадь треугольника.
     *
     * <p>Расчет площади должен быть произведем через поиск косинуса угла через теорему косинусов,
     * далее нахождение синуса через основное тригонометрическое тождество
     * и подстановку синуса в нужную формулу для площади треугольника.
     * (Всего основных способов поиска площади треугольника 6)
     *
     * <p>Входные параметры - длина сторон треугольника.
     *
     * <p>Если входные данные некорректны - метод должен возвращать -1.
     */
    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }
}
