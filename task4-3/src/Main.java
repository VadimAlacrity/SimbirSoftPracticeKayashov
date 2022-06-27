import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 4.3 ===================================\n");

        Scanner in = new Scanner(System.in);

        int d, n;
        int num;

        do {
            do {
                System.out.print("Введите целое положительное число: ");
                num = in.nextInt();
                if (num < 0) {
                    System.out.println("Вы ввели неверное число!\n");
                }
            } while (num < 0);
            do {
                System.out.print("Введите цифру: ");
                n = in.nextInt();
                if (n < 0 || n > 9) {
                    System.out.println("Вы ввели не цифру!\n");
                }
            } while (n < 0 || n > 9);
            System.out.println("Кол-во цифр " + n + " в числе " + num + ": " + NinNUM(n, num));
            System.out.print("Желаете ввести число ещё раз? (0 - нет, 1 - да) ");
            d = in.nextInt();
        } while (d != 0);

        System.out.println("\n===================================================================================");
    }
    static int NinNUM(int n, int num){
        int count = 0;
        while (num > 0) {
            if (num % 10 == n) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}