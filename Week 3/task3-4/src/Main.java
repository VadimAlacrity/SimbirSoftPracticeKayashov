import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        Scanner in = new Scanner(System.in);

        System.out.println("=================================== Задание 3.4 ===================================\n");

        double x;
        int count = 0;

        do {
            System.out.print("Введите целое положительное число: ");
            x = in.nextDouble();

            if (x % 1 != 0 || x < 0)
                System.out.println("Вы ввели неверное число");
        } while (x % 1 != 0 || x < 0);

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nВсего делителей: " + count);

        System.out.println("\n===================================================================================");

        in.close();
    }
}