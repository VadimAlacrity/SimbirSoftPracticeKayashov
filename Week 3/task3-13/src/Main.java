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

        System.out.println("=================================== Задание 3.13 ===================================\n");

        Scanner in = new Scanner(System.in);

        double num = 0;

        do {
            System.out.print("Введите целое, положительное число: ");
            num = in.nextDouble();
        } while (num <= 0 || num % 1 != 0);

        int count = 0;

        for (int i = 1; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                count = 0;
                for (int j = 1; j < i / 2 + 1; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.print(i + " ");
                }
            }
        }

        in.close();

        System.out.println("\n\n===================================================================================");
    }
}