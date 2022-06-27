import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 5.16 ==================================\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] mas = new int[n];
        System.out.print("Введите радиус окружности: ");
        int r = in.nextInt();
        Zapolnenie(mas, r);

        System.out.println("\n===================================================================================");
    }
    static void Zapolnenie(int[] mas, int r) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 11);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        Vivod(mas, r);
    }
    static void Vivod(int[] mas, int r) {
        int x, y, count = 0;
        for (int i = 0; i < mas.length; i += 2) {
            x = mas[i];
            y = mas[i + 1];
            if ((x * x + y * y) == r * r) {
                System.out.println("Точка " + (i / 2 + 1) + " с координатами (" + mas[i] + "; " + mas[i + 1] + ") лежит на окружности");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ни одна точка, из представленных в массиве, на окружности не лежит");
        }
    }
}