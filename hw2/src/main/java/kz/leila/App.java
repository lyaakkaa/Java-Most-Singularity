package kz.leila;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        // task1
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else {
                array1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array1));


//        task 2
        int[] array2 = new int[8];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * 3;
        }
        System.out.println(Arrays.toString(array2));


//        task3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array3));


//        task4
        int n = 7;
        int[][] array4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            array4[i][i] = 1;
            array4[i][n - 1 - i] = 1;
        }
        for (int[] ints : array4) {
            System.out.println(Arrays.toString(ints));
        }

//        task5
        int[] array5 = {1, 100, -19, 2, 5, 2};
        int min = 9999;
        int max = -9999;
        for (int i = 1; i < array5.length; i++) {
            if (array5[i] < min) {
                min = array5[i];
            }
            if (array5[i] > max) {
                max = array5[i];
            }
        }
        System.out.println(Arrays.toString(array5));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


//        task6
        int[] array6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Баланс: " + checkBalance(array6));


//        task7
        int[] array7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nn = 5;
        System.out.println(Arrays.toString(array7));
        shiftArray(array7, nn);
        System.out.println("Смещение на " + nn + ": " + Arrays.toString(array7));


    }

    public static boolean checkBalance(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        int left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            if (left == sum - left) {
                return true;
            }
        }
        return false;
    }

    public static void shiftArray(int[] arr, int n) {
        int len = arr.length;
        n %= len;
        if (n < 0) {
            n += len;
        }
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[len - 1];
            for (int j = len - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }
}
