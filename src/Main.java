import java.time.Year;

public class Main {

    public static void main(String[] args) {
        // УРОК № 2 - ПЕРЕМЕННЫЕ
        /* var liftingCapacity = 50;
        var stuffWeight = 20;
        var capasityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно нагрузить " + capasityLeft + " кг");

        var applesWeight = 2;
        var orangesWeights = 3;
        var fruitsWeights = applesWeight + orangesWeights;
        System.out.println("Общий вес фруктов " + fruitsWeights);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var pepperWeights = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumberWeight + pepperWeights + zucchiniWeight;
        var productsWeight = fruitsWeights + waterWeight + meatWeight + vegetablesWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес всех продуктов " + productsWeight + " кг!");

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");

        var owerload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + owerload + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Вещей в одной машине " + productsInOneCar + " кг!");

        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг!");

        double sugar = 3;
        double onePortion = sugar / 4;
        System.out.println("Вес одной порции сахара " + onePortion + " кг!");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);
        // УРОК № 3 - УСЛОВНЫЕ ОПЕРАТОРЫ
        int age = 122;
        if (age == 18) {
            System.out.println("С окончанием школы!");
        } else if (age == 21) {
            System.out.println("Иди празднуй, можешь пить алкоголь!");
        } else if (age == 7) {
            System.out.println("Иди в школу!");
        } else {
            System.out.println("Пока сказать нечего!");
        }
        // УРОК № 4 - ЦИКЛЫ
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println("Через " + i + " Месяцев, зарплата составит " + total + " рублей");
        System.out.println(i);
        System.out.println(total);


        System.out.println("Домашнее задание 2 урока - ПЕРЕМЕННЫЕ");
        System.out.println("Задача № 1 ");
        byte a = 1;
        short b = 22;
        int c = 22000999;
        long d = 393939393939L;
        float e = 1.12f;
        double f = 4999444.12933384;
        char g = 33;
        boolean skyIsClear = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(skyIsClear);
        System.out.println();
        System.out.println("Задача № 2 ");
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        var differentWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Общий вес двух боксеров составляет " + totalWeight + " кг. Разница в весе двух боксеров составляет " + differentWeight + " кг.");
        System.out.println();
        System.out.println("Задача № 3 ");
        int bananas = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        double breakfast = (bananas * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
        double breakfastInKillos = breakfast / 1000;
        System.out.println("Вес спортивного завтрака в граммах составляет " + breakfast + " грамм.");
        System.out.println("Вес завтрака в килограммах составляет " + breakfastInKillos + " кг.");
        System.out.println();
        System.out.println("Задача № 4 ");
        var needLossWeight = 7;
        var minLossWeightInDays = 0.25;
        var maxLossWeightInDays = 0.5;
        var minDayNeed = needLossWeight / maxLossWeightInDays;
        var maxDayNeed = needLossWeight / minLossWeightInDays;
        var averageDays = (maxLossWeightInDays + minLossWeightInDays) / 2;
        var needAverageDays = needLossWeight / averageDays;
        System.out.println("Минимальное количество дней составялет - " + minDayNeed + " Дней.");
        System.out.println("Максмальное количество дней составялет - " + maxDayNeed + " Дней.");
        System.out.println("Среднее количество дней составялет - " + needAverageDays + " Дней.");
        System.out.println();
        System.out.println("Задача № 5 ");
        var mashasSalary = 67760;
        var denisSalary = 83690;
        var kristinasSalary = 76230;
        var newMashasSalary = mashasSalary + (mashasSalary * 0.1);
        var newDenisSalary = denisSalary + (denisSalary * 0.1);
        var newKristinasSalary = kristinasSalary + (kristinasSalary * 0.1);
        var salaryDiffMasha = newMashasSalary - mashasSalary;
        var salaryDiffDenis = newDenisSalary - denisSalary;
        var salaryDiffKristina = newKristinasSalary - kristinasSalary;
        var mashasYear = (newMashasSalary * 12) - (mashasSalary * 12);
        var denisYear = (newDenisSalary * 12) - (denisSalary * 12);
        var kristinaYear = (newKristinasSalary * 12) - (kristinasSalary * 12);
        System.out.println("Маша теперь получает - " + newMashasSalary + " рублей. Разница в ЗП составляет " + salaryDiffMasha);
        System.out.println("Денис теперь получает - " + newDenisSalary + " рублей. Разница в ЗП составляет " + salaryDiffDenis);
        System.out.println("Кристина теперь получает - " + newKristinasSalary + " рублей. Разница в ЗП составляет " + salaryDiffKristina);
        System.out.println(mashasYear + " руб. Годовая разница в ЗП Маши");
        System.out.println(denisYear + " руб. Годовая разница в ЗП Дениса");
        System.out.println(kristinaYear + " руб. Годовая разница в ЗП Кристины");

        System.out.println("Домашнее задание 3 урока - УСЛОВНЫЕ ОПЕРАТОРЫ");
        System.out.println("Задача № 1 ");
        int clientOS = 1;
        //int iOS = 1;
        //int android = 0;
        if (clientOS == 1) {
            System.out.println("Установите приложение для iOS");
        } else {
            System.out.println("Установите приложение для Android");
        }
        System.out.println();
        System.out.println("Домашнее задание 3 урока - УСЛОВНЫЕ ОПЕРАТОРЫ");
        System.out.println("Задача № 2");
        int clientDeviceYear = 2017;
        int clientOS = 0;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для iOS по ссылке http//...");
        } else if (clientOS != 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке http//...");
        } else if (clientOS != 0 && clientDeviceYear < 2015) {
            System.out.println("Android Lite version please");
        } else {
            System.out.println("iOS Lite version please");
        }
        System.out.println();
        System.out.println("Домашнее задание 3 урока - УСЛОВНЫЕ ОПЕРАТОРЫ");
        System.out.println("Задача № 3");
        int year = 1985;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
        System.out.println();
        System.out.println("Домашнее задание 3 урока - УСЛОВНЫЕ ОПЕРАТОРЫ");
        System.out.println("Задача № 4");
        int deliveryDistance = 95;
        int  = ???????????????????????????


        System.out.println();
        System.out.println("Домашнее задание 3 урока - УСЛОВНЫЕ ОПЕРАТОРЫ");
        System.out.println("Задача № 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
        System.out.println();
        System.out.println("Домашнее задание 4 урока - ЦИКЛЫ");
        System.out.println("Задача № 1");
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        int i = 10;
        while (i > 0) {
            i = i - 1;
            System.out.print(i + " ");
        } // ОШИБКА!!!
        System.out.println();
        System.out.println("Домашнее задание 4 урока - ЦИКЛЫ");
        System.out.println("Задача № 2");
        int firstFriday = 5;
        int lastFriday = 31;
        for (int i = firstFriday; i <= lastFriday; i = i + 7) {
            System.out.println("Пятница " + i + " необходимо сдать отчет");
        } // подсматривал, не смог правильно объявить переменные

        System.out.println();
        System.out.println("Домашнее задание 4 урока - ЦИКЛЫ");
        System.out.println("Задача № 3");
        int currentYear = 2022;
        int beforeCurrentYear = (currentYear - 200);
        int afterCurrentYear = currentYear + 100;
        for (int i = 0; i <= afterCurrentYear; i = i + 79) {
            if (i >= beforeCurrentYear)
                System.out.println(i);
        }
        //УРОК № 5 - МАССИВЫ ч.1
        int[] weights = {90,91,93,92,85,87,88,89,0,0,0,0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        System.out.println();
        System.out.println("Домашнее задание 5 урока - МАССИВЫ ч.1");
        System.out.println("Задача № 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] arr1 = {1.57, 7.654, 9.986};
        boolean[] arr2 = {true};
        System.out.println();
        System.out.println("Домашнее задание 5 урока - МАССИВЫ ч.1");
        System.out.println("Задача № 2");
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println(arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
        System.out.println(arr2[0]);
        System.out.println();
        System.out.println("Домашнее задание 5 урока - МАССИВЫ ч.1");
        System.out.println("Задача № 3");
        System.out.println(arr[2] + ", " + arr[1] + ", " + arr[0]);
        System.out.println(arr1[2] + ", " + arr1[1] + ", " + arr1[0]);
        System.out.println(arr2[0]);
        System.out.println();
        System.out.println("Домашнее задание 5 урока - МАССИВЫ ч.1");
        System.out.println("Задача № 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i]++;
                System.out.println(arr);
            }
        } ???????????????????????????????????????
        //УРОК № 5 - МАССИВЫ ч.2
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {902, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weightsCopy[0] = 0;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length-1 && weights[i+1]!=0; i++) {
            System.out.println(weights[i+1] - weights[i]);
            // CTRL + ALT + T - контекстное меню для создания констукций (например условный оператор IF)
            // CTRL + SHIFT + DEL - контекстное меню для удаления
        } */

    }
}