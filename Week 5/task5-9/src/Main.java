import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 5.9 ===================================\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] mas = new int[n];
        Zapolnenie(mas);

        System.out.println("\n\n===================================================================================");
    }
    static void Zapolnenie(int[] mas) {
        int znak = (int) (Math.random() * 2 + 1);
        if (znak == 1) {
            znak = -1;
        } else {
            znak = 1;
        }
        mas[0] = znak * (int) (Math.random() * 90) + 10;
        for (int i = 1; i < mas.length; i++) {
            boolean check = false;
            int count = 0;
            while (!check) {
                znak = (int) (Math.random() * 2 + 1);
                if (znak == 1) {
                    znak = -1;
                } else {
                    znak = 1;
                }
                mas[i] = znak * (int) (Math.random() * 90) + 10;
                for (int j = 0; j < i; j++) {
                    if (mas[i] == mas[j]) {
                        count++;
                    }
                }
                if (count == 0) {
                    check = true;
                }
            }
        }
        Vivod(mas);
    }
    static void Vivod(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}