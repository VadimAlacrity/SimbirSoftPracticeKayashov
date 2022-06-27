package task5_2;

public class WorkWithMass {
    static void Zapoln(int n) {
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 90) + 10;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        Vivod(mas);
    }
    static void Vivod(int[] mas) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (i == 0 && j % 2 == 1) {
                    System.out.print(mas[j] + " ");
                } else if (i == 1 && j % 2 == 0) {
                    System.out.print(mas[j] + " ");
                }
            }
            System.out.println();
        }
    }
}