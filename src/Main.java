import Tasks.Task1;

import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[]{5 ,0 , 8 , 4, 9, 3, 7, 1};
//
//        Bubble bubble = new Bubble();
//        bubble.sortArray(array);

        Task1 task1 = new Task1();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input p");
        int p = scanner.nextInt();
        System.out.println("Input m1");
        double m1 = scanner.nextDouble();
        System.out.println("Input m2");
        double m2 = scanner.nextDouble();

        System.out.println(task1.valueG(a, p, m1, m2));

    }
}