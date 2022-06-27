package task5_4;

public class WorkWithMass {
    static void Zapoln(int n) {
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 900) + 100;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        Vivod(mas);
    }
    static void Vivod(int[] mas) {
        if (mas.length % 2 == 0) {
            for (int i = 0; i < mas.length / 2; i++) {
                System.out.println(mas[i] + " | " + mas[mas.length-(i+1)]);
            }
        } else if (mas.length % 2 == 1) {
            for (int i = 0; i < mas.length / 2 + 1; i++) {
                if (i != mas.length / 2) {
                    System.out.println(mas[i] + " | " + mas[mas.length - (i + 1)]);
                } else if (i == mas.length / 2) {
                    System.out.println(mas[i]);
                }
            }
        }
    }
}
