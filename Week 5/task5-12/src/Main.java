import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 5.12 ==================================\n");

        Scanner in = new Scanner(System.in);

        int[] mas = new int[20];
        int[] mas1 = new int[20];
        Zapolnenie(mas, mas1);

        System.out.println("\n===================================================================================");
    }
    static void Zapolnenie(int[] mas, int[] mas1) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 21) - 10;
            System.out.print(mas1[i] + " ");
        }
        int count = 0;
        boolean check = true;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas1.length; j++) {
                if (mas[i] == mas1[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count != mas.length) {
            check = false;
        }
        Vivod(check, count);
    }
    static void Vivod(boolean check, int count) {
        if (check) {
            System.out.println("\nВторой массив содержит в себе все элементы первого массива");
        } else {
            System.out.println("\nВторой массив не содержит в себе все элементы первого массива");
        }
    }
}