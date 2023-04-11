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
        int i = 0;
        int money = 15000;
        while (total < 2_459_000) {
            total = total + money;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Чтобы накопить необходимую сумму потребуется " + i + " месяц(ев).");
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        int t = 0;
        while (t < 10) {
            t++;
            System.out.print("" + t);
        }
        System.out.println();
        for (; t > 0; t--) {
            System.out.print("" + t);
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println();
        System.out.println("Задание 3");
        double Y = 12_000_000;
        double annualPopulationGrowth = Y / 1000 * (12 - 7);
        int i = 0;
        while (i < 10) {
            Y = Y + annualPopulationGrowth;
            annualPopulationGrowth = Y / 1000 * (12 - 7);
            i++;
            System.out.println("Год " + i + ", численность населения составляет " + Y);
        }
    }


    public static void task4() {
        System.out.println();
        System.out.println("Задание 4");
        double contribution = 15000;
        int i = 0;
        while (contribution < 12_000_000) {
            contribution = contribution * 1.07;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений: " + contribution);
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("Задание 5");
        double contribution = 15000;
        int i = 0;
        while (contribution < 12_000_000) {
            contribution = contribution * 1.07;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений: " + contribution);
            }
        }
    }

    public static void task6() {
        System.out.println();
        System.out.println("Задание 6");
        double contribution = 15000;
        int i = 0;
        int j = 0;
        while (i < 9 * 12) {
            contribution = contribution * 1.07;
            i++;
            if (i % 6 == 0) {
                j++;
                System.out.println("Полугодие " + j + " сумма накоплений: " + contribution);
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
            if (year>=2023-200&&year<=2023+100){
                System.out.println(year);
            }
        }
    }
}
