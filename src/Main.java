public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int a = 5789;
        System.out.println("Значение переменной a с типом int равно " + a );
        byte b = 5;
        System.out.println("Значение переменной b с типом byte равно " + b );
        short s = 30254;
        System.out.println("Значение переменной s с типом short равно " + s );
        long l = 301256;
        System.out.println("Значение переменной l с типом long равно " + l );
        float apple = 3.5f;
        System.out.println("Значение переменной apple с типом float равно " + apple );
        double d = 3.2548;
        System.out.println("Значение переменной d с типом double равно " + d );
            }
    public static void task2() {
        System.out.println("Задача 2");
        float weihtAppel = 27.12f;
        long lg = 987678965549L;
        float weihtOrang = 2.786f;
        short p = 569;
        short i = -159;
        short k = 27897;
        byte u = 67;

    }
    public static void task3() {
        System.out.println("Задача 3");
        byte lydmilaStudent = 23;
        byte annaStudent = 27;
        byte ekaterinaStudent = 30;
        short page = 480;
        int pageOneStudent = page / (lydmilaStudent + annaStudent + ekaterinaStudent);
        System.out.println("На каждого ученика рассчитано " + pageOneStudent + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottleOneMinute = 16 / 2;
        int bottleDay = bottleOneMinute * 60 * 24;
        int bottle20Minute = bottleOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottle20Minute + " штук бутылок.");
        System.out.println("За 1 сутки машина произвела " + bottleDay + " штук бутылок.");
        int bottle3Day = bottleDay * 3;
        System.out.println("За 3 дня машина произвела " + bottle3Day + " штук бутылок.");
        int bottleMonth = bottleDay * 30;
        System.out.println("За 1 месяц машина произвела " + bottleMonth + " штук бутылок.");
           }
    public static void task5() {
        System.out.println("Задача 5");
        byte potWhitePaintOneClass = 2;
        byte potBrowePaintOneClass = 4;
        byte totalPaint = 120;
        int totalClass = totalPaint / (potWhitePaintOneClass + potBrowePaintOneClass);
        int totalWhitePaint = totalClass * potWhitePaintOneClass;
        int totalBrowePaint = totalClass * potBrowePaintOneClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrowePaint + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short oneBanan = 80;
        short milk100Ml = 105;
        short plombir = 100;
        short eggs = 70;
        int breakfastGram = 5 * oneBanan + 2 * milk100Ml + 2 * plombir + 4 * eggs;
        float breakfastKl = breakfastGram / 1000f;
        System.out.println("Вес такого завтрака будет " + breakfastGram + " грамм, или " + breakfastKl + " килограмм.");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int gramDay250 = 250;
        int gramDay500 = 500;
        float klDay250 = 250 / 1000f;
        float klDay500 = 500 / 1000f;
        byte offKl = 7;
        float totalDayPo250 = offKl / klDay250;
        float totalDayPo500 = offKl / klDay500;
        System.out.println("если терять по 250 грамм, то понадобиться " + totalDayPo250 + " дней, а если по 500 грамм то " + totalDayPo500 + " дней.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        byte monthsYear = 12;
        int mashaBefore = 67760;
        int denisBefore = 83690;
        int kristinaBefore = 76230;
        float raising = 1.1f;
        float mashaAfter = mashaBefore * raising;
        float denisAfter = denisBefore * raising;
        float kristinaAfter = kristinaBefore * raising;
        float mashaDifference = monthsYear * mashaAfter % (monthsYear * mashaBefore);
        float denisDifference = monthsYear * denisAfter - monthsYear * denisBefore;
        float kristinaDifference = monthsYear * kristinaAfter % (monthsYear * kristinaBefore);
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Маша теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Маша теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}