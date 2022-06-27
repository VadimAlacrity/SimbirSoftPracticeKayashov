import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 4.6 ===================================\n");

        Scanner in = new Scanner(System.in);

        int d, n;
        int x, y;

        do {
            System.out.print("Введите координату X точки А: ");
            x = in.nextInt();
            System.out.print("Введите координату Y точки А: ");
            y = in.nextInt();
            n = CoordinateSystem(x, y);
            if (n == 1 || n == 3 || n == 4) {
                System.out.println("Точка расположена в " + n + " четверти системы координат");
            } else if (n == 2) {
                System.out.println("Точка расположена во " + n + " четверти системы координат");
            } else if (n == 5) {
                System.out.println("Точка расположена на координатной оси Y");
            } else if (n == 6) {
                System.out.println("Точка расположена на координатной оси X");
            } else {
                System.out.println("Точка расположена в начале координат");
            }
            System.out.print("Желаете ввести число ещё раз? (0 - нет, 1 - да) ");
            d = in.nextInt();
        } while (d != 0);

        System.out.println("\n===================================================================================");
    }
    static int CoordinateSystem(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else if (x == 0 && y != 0) {
            return 5;
        } else if (x != 0 && y == 0) {
            return 6;
        } else {
            return 7;
        }
    }
}