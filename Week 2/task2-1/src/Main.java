import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        Scanner in = new Scanner(System.in);

        System.out.println("===================================================================================");
        System.out.print("Введите значение переменной avg: ");
        int avg = in.nextInt();
        if (avg == 100)
            System.out.println("Молодец!");
        System.out.println("===================================================================================");

        System.out.print("Введите значение переменной mark: ");
        double mark = in.nextDouble();
        if (mark < 60)
            System.out.printf("mark = %.2f", mark * 1.1);
        System.out.println("\n===================================================================================");

        System.out.print("Введите значение переменной one: ");
        double one = in.nextDouble();
        System.out.print("Введите значение переменной two: ");
        double two = in.nextDouble();
        if (one < two)
            System.out.println("one = " + one);
        else if (one > two)
            System.out.println("two = " + two);
        else
            System.out.println("one = two = " + one);
        System.out.println("===================================================================================");

        System.out.print("Введите значение переменной num: ");
        double num = in.nextDouble();
        if (num < 0)
            System.out.println("Отрицательное");
        else if (num > 0)
            System.out.println("Положительное");
        else
            System.out.println("num = 0");
        System.out.println("===================================================================================");

        System.out.println("Введите значения углов: ");

        System.out.print("ugol1 = ");
        int ugol1 = in.nextInt();
        System.out.print("ugol2 = ");
        int ugol2 = in.nextInt();
        System.out.print("ugol3 = ");
        int ugol3 = in.nextInt();

        if ((ugol1 + ugol2 + ugol3) == 180)
            System.out.println("Это углы одного треугольника");
        else
            System.out.println("Это не углы одного треугольника");
        System.out.println("===================================================================================");

        in.close();
    }
}