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

        System.out.println("=================================== Задание 3.3 ===================================\n");

        System.out.println("В каком порядке выводить числа?");
        int v;

        do {
            System.out.println("Введите 0 - если по возрастанию, 1 - если по убыванию");

            v = in.nextInt();
            if (v == 0) {
                for (int i = 10; i < 100; i++) {
                    if (9 < ((i % 10) * (i / 10)) && ((i % 10) * (i / 10)) < 100)
                        System.out.print(i + " ");
                }
            } else if (v == 1) {
                for (int i = 99; i > 9; i--) {
                    if (9 < ((i % 10) * (i / 10)) && ((i % 10) * (i / 10)) < 100)
                        System.out.print(i + " ");
                }
            } else {
                System.out.println("Вы ввели не 0 или 1");
            }
        } while (v != 0 && v != 1);

        System.out.println("\n\n===================================================================================");

        in.close();
    }
}