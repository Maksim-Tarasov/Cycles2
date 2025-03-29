public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
        eighthTask();
    }

    public static void firstTask() {
        int savings = 0;
        int monthlyContribution = 15000;
        int target = 2459000;
        int months = 0;

        while (savings < target) {
            months++;
            savings += monthlyContribution;
        }

        System.out.println("Месяц " + months + ", сумма накоплений равна " + savings + " рублей");
    }

    public static void secondTask() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
    }

    public static void thirdTask() {
        var population = 12_000_000;
        var birthRate = 0.017;
        var deathRate = 0.008;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            var growth = (birthRate - deathRate) * population;
            population += growth;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void fourthTask() {
        var savings = 15000;
        var monthlyInterestRate = 0.07;
        var target = 12_000_000;
        int months = 0;

        while (savings < target) {
            months++;
            savings *= (1 + monthlyInterestRate);
            System.out.println("Месяц" + months + "сумма накоплений равна" + savings + "рублей");
        }
    }

    public static void fifthTask() {
        var savings = 15000;
        var monthlyInterestRate = 0.07;
        var target = 12_000_000;
        int months = 0;

        while (savings < target) {
            months++;
            savings *= (1 + monthlyInterestRate);
            System.out.println("Месяц" + months + "сумма накоплений равна" + savings + "рублей");
        }
    }

    public static void sixthTask() {
        float sum = 15000f;
        int countMonth = 0;
        int years = 9;
        while (countMonth < years * 12) {
            countMonth++;
            float per = (sum / 100) * 7;
            sum += per;
            if (countMonth % 6 == 0)
                System.out.println(countMonth + ") сумма: " + (int) sum);
        }
        System.out.println("Всего " + countMonth + " месяцев, общая сумма: " + (int) sum + " рублей");

    }

    public static void seventhTask() {
        int currentDay = 7 + 1;
        while (currentDay < 31) {
            System.out.println("Сегодня пятница," + currentDay + "-е число. Необходимо подготовить отчет");
            currentDay += 7;
        }
    }

    public static void eighthTask() {
        int tmp = 79;
        int minYear = 1825;
        int maxYear = 2125;
        for (int i = minYear; i < maxYear; i++) {
            if (i % tmp == 0)
                System.out.println(i);
        }
    }
}











