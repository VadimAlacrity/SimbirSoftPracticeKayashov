import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println(" ██████╗ ██╗ ███╗   ███╗ ██████╗  ██╗ ██████╗   ██████╗  █████╗  ███████╗ ████████╗");
        System.out.println("██╔════╝ ██║ ████╗ ████║ ██╔══██╗ ██║ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔════╝ ╚══██╔══╝");
        System.out.println("╚█████╗  ██║ ██╔████╔██║ ██████╦╝ ██║ ██████╔╝ ╚█████╗  ██║  ██║ █████╗      ██║   ");
        System.out.println(" ╚═══██╗ ██║ ██║╚██╔╝██║ ██╔══██╗ ██║ ██╔══██╗  ╚═══██╗ ██║  ██║ ██╔══╝      ██║   ");
        System.out.println("██████╔╝ ██║ ██║ ╚═╝ ██║ ██████╦╝ ██║ ██║  ██║ ██████╔╝ ╚█████╔╝ ██║         ██║   ");
        System.out.println("╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═════╝  ╚═╝ ╚═╝  ╚═╝ ╚═════╝   ╚════╝  ╚═╝         ╚═╝   ");

        Scanner in = new Scanner(System.in);

        System.out.println("=================================== Задание 3.11 ===================================\n");

        int people = 0;
        double weight = 0, w = 0;

        do {
            System.out.print("Введите вес вошедшего человека: ");
            w = in.nextDouble();
            weight += w;
            people++;
        } while (people < 6 && weight < 450);

        if (weight <= 450 && people == 6) {
            System.out.println("Всего человек вошло: " + people);
            System.out.println("Общий вес вошедших людей: " + weight + "кг");
            System.out.println("Вход прекращён, так как вошло уже 6 человек");
        } else if (weight == 450 && people < 6) {
            System.out.println("Всего человек вошло: " + people);
            System.out.println("Общий вес вошедших людей: " + weight + "кг");
            System.out.println("Вход прекращён, так как достигнут максимум веса вошедших людей");
        } else {
            System.out.println("Всего человек вошло: " + (people - 1));
            System.out.println("Общий вес вошедших людей: " + (weight - w) + "кг");
            System.out.println("Вход прекращён, так как общий вес вошедших превысил 450кг\n(последний человек, чей вес нарушил правило не вошёл в лифт)");
        }

        System.out.println("\n===================================================================================");

        in.close();
    }
}