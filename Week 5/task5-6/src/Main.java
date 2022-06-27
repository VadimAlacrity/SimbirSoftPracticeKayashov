import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 5.6 ===================================\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt(), S = 100;
        int[] mas = new int[n];
        Zapolnenie(mas, S);

        System.out.println("\n\n===================================================================================");
    }
    static void Zapolnenie(int[] mas, int S) {
        if (mas.length % 2 == 0) {
            for (int i = mas.length - 1; i > -1; i--) {
                if (i % 2 == 1) {
                    mas[i] = (int) (Math.random() * 90) + 10;
                } else if (i % 2 == 0) {
                    mas[i] = S - mas[i + 1];
                }
            }
        } else if (mas.length % 2 == 1) {
            for (int i = mas.length - 1; i > -1; i--) {
                if (i % 2 == 1) {
                    mas[i] = (int) (Math.random() * 90) + 10;
                } else if (i % 2 == 0) {
                    if (i + 1 == mas.length) {
                        mas[i] = 100;
                    } else if (i + 1 < mas.length) {
                        mas[i] = S - mas[i + 1];
                    }
                }
            }
        }
        System.out.println("S = " + S);
        Vivod(mas);
    }
    static void Vivod(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}