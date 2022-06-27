import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 4.7 ===================================\n");

        Scanner in = new Scanner(System.in);

        int d, n;
        int x, x1, y, y1, r;

        do {
            System.out.print("Введите координату X центра окружности: ");
            x = in.nextInt();
            System.out.print("Введите координату Y центра окружности: ");
            y = in.nextInt();
            System.out.print("Введите радиуус окружности: ");
            r = in.nextInt();
            System.out.print("Введите координату X точки: ");
            x1 = in.nextInt();
            System.out.print("Введите координату Y точки: ");
            y1 = in.nextInt();
            n = PointInside(x, y, x1, y1, r);
            if (n == 1) {
                System.out.println("Точка входит в окружность");
            } else if (n == 0) {
                System.out.println("Точка находится на окружности");
            } else {
                System.out.println("Точка находится вне окружности");
            }
            System.out.print("Желаете ввести число ещё раз? (0 - нет, 1 - да) ");
            d = in.nextInt();
        } while (d != 0);

        System.out.println("\n===================================================================================");
    }
    static int PointInside(int x, int y, int x1, int y1, int r) {
        int Inside;

        Inside = (int) Math.sqrt(Math.pow((x1-x), 2) + Math.pow((y1-y), 2));

        if (r >= Inside) {
            return 1;
        } else if (r == Inside) {
            return 0;
        } else {
            return -1;
        }
    }
}