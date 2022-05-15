import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double n1 = in.nextDouble();

        System.out.print("Введите второе число: ");
        double n2 = in.nextDouble();

        if (n1 > n2)
            System.out.print("Первое число больше второго");
        else if (n1 == n2)
            System.out.print("Числа равны");
        else
            System.out.print("Первое число меньше второго");

        in.close();
    }
}