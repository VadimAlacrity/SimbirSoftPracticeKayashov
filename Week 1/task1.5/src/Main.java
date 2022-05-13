import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double n1 = in.nextDouble();

        System.out.print("Введите действие (+, -, *, /): ");
        String d = in.next();

        System.out.print("Введите второе число: ");
        double n2 = in.nextDouble();

        if (n2 == 0 && d.equals("/"))
            System.out.println("Делить на 0 нельзя!");
        else if (n2 != 0 && d.equals("/"))
            System.out.println("Деление числа " + n1 + " на " + n2 + " равно: " + (n1 / n2));
        else if (d.equals("*"))
            System.out.println("Произведение числа " + n1 + " и " + n2 + " равно: " + (n1 * n2));
        else if (n2 != 0 && d.equals("+"))
            System.out.println("Сумма чисел " + n1 + " и " + n2 + " равна: " + (n1 + n2));
        else if (d.equals("-"))
            System.out.println("Разница чисел " + n1 + " и " + n2 + " равна: " + (n1 - n2));
        else
            System.out.println("Вы ввели некорреткный знак действия");

        in.close();
    }
}