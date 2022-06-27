import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 5.11 ==================================\n");

        Scanner in = new Scanner(System.in);

        int[] mas = new int[20];
        int[] mas1 = new int[20];
        Zapolnenie(mas, mas1);

        System.out.println("\n===================================================================================");
    }
    static void Zapolnenie(int[] mas, int[] mas1) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
            mas1[i] = (int) (Math.random() * 21) - 10;
        }
        boolean check = true;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != mas1[i]) {
                check = false;
                break;
            }
        }
        Vivod(check);
    }
    static void Vivod(boolean check) {
        if (check) {
            System.out.println("Массивы идентичные");
        } else {
            System.out.println("Массивы разные");
        }
    }
}