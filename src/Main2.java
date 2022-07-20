import java.util.Scanner;

class Main2 {

    public static int calcYear(int year) {
        int x = 0;
        if (year % 400 == 0) {
            x = 366;
        } else if ((year % 100 != 0) && (year % 4 == 0 )) {
            x = 366;
        } else {
            x = 365;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int right = 0;
        while (true) {
            System.out.println("Введите год и количество дней:");
            int year = scanner.nextInt();
            int days = scanner.nextInt();
            int x = calcYear(year);
            if (x == days) {
                System.out.println("Правильно!");
                right++;
            } else {
                System.out.println("Неправильно!");
                break;
            }

        } System.out.println("Ваш результат: " + right);
    }
}