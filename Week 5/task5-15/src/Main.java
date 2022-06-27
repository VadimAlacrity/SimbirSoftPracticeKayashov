import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 5.15 ==================================\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер первого массива: ");
        int n = in.nextInt();
        int[] mas = new int[n];
        System.out.print("Введите размер второго массива: ");
        n = in.nextInt();
        int[] mas1 = new int[n];
        Zapolnenie(mas, mas1);

        System.out.println("\n\n===================================================================================");
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
        System.out.println();
        int[] mas2 = new int[Math.max(mas.length, mas1.length)];
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            int count = 0;
            for (int j = 0; j < mas1.length; j++) {
                if (mas[i] != mas1[j]) {
                    count++;
                }
            }
            if (count == mas1.length) {
                mas2[k] = mas[i];
                k++;
            }
        }
        Vivod(mas2, k);
    }
    static void Vivod(int[] mas, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}