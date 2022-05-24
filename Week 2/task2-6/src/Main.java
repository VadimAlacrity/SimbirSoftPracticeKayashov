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

        int num = 0;

        do
        {
            System.out.print("Введите целое двузначное положительное число: ");
            num= in.nextInt();

            if (num > 9 && num < 100)
            {
                int num1 = num / 10, num2 = num % 10;
                if (num1 > num2)
                    System.out.println("Первая цифра числа больше второй!");
                else if (num1 < num2)
                    System.out.println("Вторая цифра числа больше первой!");
                else
                    System.out.print("");
            }
            else
                System.out.println("Ошибка введённого числа");
        }
        while (num <= 9 || num >= 100);

        in.close();
    }
}