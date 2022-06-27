import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        System.out.println("=================================== Задание 4.5 ===================================\n");

        Scanner in = new Scanner(System.in);

        int d;
        int x, x1, y, y1;

        do {
            System.out.print("Введите координату X точки А: ");
            x = in.nextInt();
            System.out.print("Введите координату Y точки А: ");
            y = in.nextInt();
            System.out.print("Введите координату X точки B: ");
            x1 = in.nextInt();
            System.out.print("Введите координату Y точки B: ");
            y1 = in.nextInt();
            System.out.println(LengthBetweenPoints(x, y, x1, y1));
            System.out.print("Желаете ввести число ещё раз? (0 - нет, 1 - да) ");
            d = in.nextInt();
        } while (d != 0);

        System.out.println("\n===================================================================================");
    }
    static int LengthBetweenPoints(int x, int y, int x1, int y1) {
        int length;

        length = (int) Math.sqrt(Math.pow((x1-x), 2) + Math.pow((y1-y), 2));

        return length;
    }
}