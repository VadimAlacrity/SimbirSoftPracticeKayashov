import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 4.2 ===================================\n");

        Scanner in = new Scanner(System.in);

        int d;
        double num;

        do {
            do {
                System.out.print("Введите целое положительное число: ");
                num = in.nextDouble();
                if (num < 0 || num % 1 != 0) {
                    System.out.println("Вы ввели неверное число!\n");
                }
            } while (num < 0 || num % 1 != 0);
            System.out.println("Общее кол-во делителей: " + Del(num));
            System.out.print("Желаете ввести число ещё раз? (0 - нет, 1 - да) ");
            d = in.nextInt();
        } while (d != 0);

        System.out.println("\n===================================================================================");
    }
    static int Del(double num){
        int count = 0;
        for (double i = num; i <= num * 2; i++) {
            for (double j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}