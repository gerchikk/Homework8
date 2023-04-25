public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Массив 1");
        int[] weights1 = new int [3];
        weights1 [0] = 1;
        weights1 [1] = 2;
        weights1 [2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weights1[i]);
        }
        System.out.println("Массив 2");
        double[] weights2 = {1.4334, 2.6565, 3.32} ;
        for (int i = 0; i < 3; i++) {
            System.out.println(weights2[i]);
        }




    }

}
