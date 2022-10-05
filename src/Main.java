import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");

        int salary2 = 15000;
        int total2 = 0;
        int i = 0;
        while ( total2 <= 2_459_000) {
            total2 += salary2/100;
            total2 += salary2;
            i++;
            System.out.println("В месяц " + i +" сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println(total2);

        // Задание 2
        System.out.println("Задание 2");
        int j = 0;
        while ( j < 10) {
            j++;
            System.out.print(j+ " ");
        }

        {System.out.println();};

        for (j = 10;j > 0; j--) {
            System.out.print(j+ " ");
        }

        {System.out.println();};

        // Задание 3
        System.out.println("Задание 3");
        int Y = 12_000_000;
        int birthRatePeople = Y / 1000 * 11;
        int deathRatePeople = Y / 1000 * 8;
        int g = 0;
        while (g < 10) {
            Y+=birthRatePeople;
            Y-=deathRatePeople;
            g++;
            System.out.println("Год " + g + " , численность населения составляет " + Y);
        }
        // Задание 4
        System.out.println("Задание 4");

        int salary3 = 15000;
        int total3 = 0;
        int p = 0;
        while ( p <= 12 * 9) {
            total3 += salary3/100*7;
            total3 += salary3;
            p++;
            if (p % 6 == 0) {
                System.out.println("В месяц " + p +" сумма накоплений равна " + total3 + " рублей");}
        }


        // Задание 4.4
        System.out.println("Задание 4.4");

        int friday = 6;
        for (int q = 1; q<=31;q++){
            if (q == friday) {
                System.out.println("Сегодня пятница, " + friday + "-e число. Необходимо подготовить отчет.");
                friday+=7;
            }
        }
        // Задание 3.1 Кометы
        System.out.println("Задание 3.1 Кометы");

        for (int w = 0 ;w <=2022+100;w+=79){
            if (w > 2022-200){
                System.out.println(w);
            }
        }
        // Задание 3.2 Таблица Умножения
        System.out.println("Задание 3.2 Таблица Умножения");
        int two = 2;
        for (int f=1;f<=10;f++){
            int equal =two*f;
            System.out.println(two+" * "+ f +" = " + equal);
        }
        }

        }










