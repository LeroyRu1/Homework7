public class Main {
    public static void main(String[] args) {

        //Задача 1

        int input = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + input;
            month++;
            if (total >= 2_459_000) {
                System.out.println("Сумма " + total + " накоплений больше заданной");
            } else {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
            }
        }

        //Задача 2

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i);
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        //Задача 3
        int people = 12_000_000;
        int birthrate = 17;
        int deathrate = 8;
        int birthrateTotal = people * birthrate / 1000;
        int deathrateTotal = people * deathrate / 1000;
        int years = 0;
        while (years < 10) {
            people = people + birthrateTotal - deathrateTotal;
            years++;
            System.out.println("Год " + years + ", численность населения составляем " + people);
        }

        //Задача 4
        int depositAmount = 15000;
        int percent = 7;
        int month1 = 0;
        while (depositAmount < 12_000_000) {
            depositAmount = depositAmount + (depositAmount * percent / 100);
            month1++;
            System.out.println("Месяц " + month1 + ", сумма накоплений " + depositAmount);
        }

        //Задача 5
        int depositAmount1 = 15000;
        int percent1 = 7;
        int month2 = 0;
        while (depositAmount1 < 12_000_000) {
            depositAmount1 = depositAmount1 + (depositAmount1 * percent / 100);
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений " + depositAmount1);
            }
        }

        //Задача 6
        int vasiliMoney = 15000;
        int vasiliYears = 9;
        int vasiliiPercent = 7;
        int vasiliiTotalMonths = vasiliYears * 12;
        int month3 = 0;
        while (month3 <= vasiliiTotalMonths) {
            vasiliMoney = vasiliMoney + (vasiliMoney * vasiliiPercent / 100);
            month3++;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений у Василия " + vasiliMoney);
            }
        }

        //Задача 7
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }

        //Задача 8
        int currentYear = 2024;
        int lastYears = currentYear - 200;
        int futureYears = currentYear + 100;
        while (futureYears > lastYears) {
            lastYears++;
            if (lastYears % 79 == 0) {
                System.out.println(lastYears);
            }
        }
    }
}
