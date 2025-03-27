public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
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
}









