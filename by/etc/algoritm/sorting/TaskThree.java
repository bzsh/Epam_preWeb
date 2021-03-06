/*
Сортировка выбором.
*/

package by.etc.algoritm.sorting;

/*Сортировка выбором. Дана последовательность чисел
.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.*/

public class TaskThree {
    public static void main(String[] args) {
        task(30);
    }

    private static void task(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);    // заполнение массива
        }

        System.out.println();
        for (int i : arr) {                   // печать массива
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) { // сортировка

            int max = arr[i];
            int max_i = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = arr[i];
                arr[i] = arr[max_i];
                arr[max_i] = tmp;
            }
        }

        System.out.println();
        for (int i : arr) {               // печать массива
            System.out.print(i + " ");
        }
    }
}
