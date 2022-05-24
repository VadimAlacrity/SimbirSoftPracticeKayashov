package task2_4;

public class Vivod
{
    static void Vivod_number(double num1, double num2)
    {
        if (num1 != num2)
        {
            System.out.println("\nПо возрастанию:\n" + Math.min(num1, num2) + " " + Math.max(num1, num2));
            System.out.println("По убыванию:\n" + Math.max(num1, num2) + " " + Math.min(num1, num2));
        }
        else
            System.out.println("Числа равны");
    }
}
