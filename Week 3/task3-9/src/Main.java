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

        System.out.println("=================================== Задание 3.9 ===================================\n");

        int count = 0, n = 1;

        while (count < 5) {
            System.out.print("Введите целое число: ");
            int num = in.nextInt();
            if (n % 2 == 1 && num % 2 == 0) {
                count++;
            }
            n++;
        }

        System.out.println("Ввод прекращён, так как кол-во чётных чисел на нечётных местах достигло 5");

        System.out.println("\n===================================================================================");

        in.close();
    }
}