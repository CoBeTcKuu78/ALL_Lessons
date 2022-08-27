import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // УРОК № 1 - ПЕРЕМЕННЫЕ
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
        // УРОК № 2 - УСЛОВНЫЕ ОПЕРАТОРЫ
        int age = 122;
        if (age == 18) {
            System.out.println("С окончанием школы!");
        } else if (age == 21) {
            System.out.println("Иди празднуй, можешь пить алкоголь!");
        } else if (age == 7) {
            System.out.println("Иди в школу!");
        } else {
            System.out.println("Пока сказать нечего!");
        } */
        // УРОК № 3 - ЦИКЛЫ
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
        //System.out.println("Через " + i + " Месяцев, зарплата составит " + total + " рублей");
        //System.out.println(i);
        System.out.println(total);
    }
}