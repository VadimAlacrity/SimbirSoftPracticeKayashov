package tash2_7;

public class Number_changes
{
    static void Num_changes(int num)
    {
        System.out.println("Преобразование числа...");
        if (num > 500)
        {
            int[] parse_num = new int[3];
            parse_num[0] = num / 100;
            parse_num[1] = (num / 10) % 10;
            parse_num[2] = num % 10;
            System.out.println(num + " => " + parse_num[2] + "" + parse_num[1] + "" + parse_num[0]);
        }
        else
        {
            int[] parse_num = new int[3];
            parse_num[0] = num / 100;
            parse_num[1] = (num / 10) % 10;
            parse_num[2] = num % 10;
            System.out.println(num + " => " + parse_num[0] + "" + parse_num[2] + "" + parse_num[1]);
        }
    }
}
