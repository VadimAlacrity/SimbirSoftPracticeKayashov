import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину прямоуглоьника: ");
        double a = in.nextDouble();

        System.out.print("Введите длину прямоуглоьника: ");
        double b = in.nextDouble();

        double P = (a * b) * 2, D = Math.sqrt(a * a + b * b);

        System.out.println("\nПериметр прямоугольника равен: " + P +
                "\nДлина диагонали прямоугольника равна: " + D);

        in.close();
    }
}