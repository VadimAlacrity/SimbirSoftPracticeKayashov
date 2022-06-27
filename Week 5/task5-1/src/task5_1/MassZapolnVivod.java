package task5_1;

public class MassZapolnVivod {
    static void Zapoln(int n) {
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 900) + 100;
        }
        Vivod(mas);
    }
    static void Vivod(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            if (i == mas.length / 2) {
                System.out.print("\n" + mas[i] + " ");
            }
        }
    }
}