import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Массив 1");
        int[] weights1 = new int[3];
        weights1[0] = 1;
        weights1[1] = 2;
        weights1[2] = 3;
        for (int i = 0; i < weights1.length; i++) {
            System.out.println(weights1[i]);
        }
        System.out.println("Массив 2");
        double[] weights2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights2.length; i++) {
            System.out.println(weights2[i]);
        }
        System.out.println("Массив 3");
        int[] weights3 = {5, 7, 45, 67, 34, 8, 0, 1};
        for (int i = 0; i < weights3.length; i++) {
            System.out.println(weights3[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Массив 1");
        int[] weights1 = new int[3];
        weights1[0] = 1;
        weights1[1] = 2;
        weights1[2] = 3;
        for (int i = 0; i < weights1.length; i++) {
            if (i == weights1.length - 1) {
                System.out.println(weights1[i]);
                break;
            }
            System.out.print(weights1[i] + ", ");
        }

        System.out.println("Массив 2");
        double[] weights2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights2.length; i++) {
            if (i == weights2.length - 1) {
                System.out.println(weights2[i]);
                break;
            }
            System.out.print(weights2[i] + ", ");
        }

        System.out.println("Массив 3");
        int[] weights3 = {5, 7, 45, 67, 34, 8, 0, 1};
        for (int i = 0; i < weights3.length; i++) {
            if (i == weights3.length - 1) {
                System.out.println(weights3[i]);
                break;
            }
            System.out.print(weights3[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Массив 1");
        int[] weights1 = new int[3];
        weights1[0] = 1;
        weights1[1] = 2;
        weights1[2] = 3;
        for (int i = weights1.length - 1; i < weights1.length && i >= 0; i--) {
            if (i == 0) {
                System.out.println(weights1[i]);
                break;
            }
            System.out.print(weights1[i] + ", ");
        }

        System.out.println("Массив 2");
        double[] weights2 = {1.57, 7.654, 9.986};
        for (int i = weights2.length - 1; i < weights2.length && i >= 0; i--) {
            if (i == 0) {
                System.out.println(weights2[i]);
                break;
            }
            System.out.print(weights2[i] + ", ");
        }

        System.out.println("Массив 3");
        int[] weights3 = {5, 7, 45, 67, 34, 8, 0, 1};
        for (int i = weights3.length - 1; i < weights3.length && i >= 0; i--) {
            if (i == 0) {
                System.out.println(weights3[i]);
                break;
            }
            System.out.print(weights3[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        System.out.println("Массив 1");
        int[] weights1 = new int[3];
        weights1[0] = 1;
        weights1[1] = 2;
        weights1[2] = 3;
        for (int i = 0; i < weights1.length; i++ ) {
            if (weights1[i] % 2 != 0) weights1[i]++;
        }
        System.out.println(Arrays.toString(weights1));
    }
}

