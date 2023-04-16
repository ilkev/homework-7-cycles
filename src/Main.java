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
        System.out.println();
        System.out.println("Задание 1");
        int total = 0;
        int month = 0;
        int money = 15000;
        while (total < 2_459_000) {
            total = total + money;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Чтобы накопить необходимую сумму потребуется " + month + " месяц(ев).");
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print("" + i);
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print("" + i);
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println();
        System.out.println("Задание 3");
        double population = 12_000_000;
        double annualPopulationGrowth = population / 1000 * (12 - 7);
        int year = 0;
        while (year < 10) {
            population = population + annualPopulationGrowth;
            annualPopulationGrowth = population / 1000 * (12 - 7);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }


    public static void task4() {
        System.out.println();
        System.out.println("Задание 4");
        double contribution = 15000;
        int month = 0;
        while (contribution < 12_000_000) {
            contribution = contribution * 1.07;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений: " + contribution);
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("Задание 5");
        double contribution = 15000;
        int month = 0;
        while (contribution < 12_000_000) {
            contribution = contribution * 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений: " + contribution);
            }
        }
    }

    public static void task6() {
        System.out.println();
        System.out.println("Задание 6");
        double contribution = 15000;
        int month = 0;
        int halfYear = 0;
        while (month< 9 * 12) {
            contribution = contribution * 1.07;
            month++;
            if (month % 6 == 0) {
                halfYear++;
                System.out.println("Полугодие " + halfYear + " сумма накоплений: " + contribution);
            }
        }
    }

    public static void task7() {
        System.out.println();
        System.out.println("Задание 7");
        int month = 31;
        int day = 1;
        for (; day<=month; day++){
            if (day%5==0){
                break;
            }
        }
        while (day<=month){
            System.out.println("Сегодня пятница, "+day+"-е число. Необходимо подготовить отчет");
            day=day+7;
        }

    }



    public static void task8(){
        System.out.println();
        System.out.println("Задание 8");
        for (int year = 0; year<2100; year=year+79){
            if (year>=2023-200){
                System.out.println(year);
            }
        }
    }
}
