package ru.agcon.new_labs.laba3;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args)
    {
        System.out.print("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n < 11)
        {
            System.out.print("Число не подходит. Нужно число большее 10. Повторите ввод: ");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        int odd = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n);
            if (arr[i] % 2 == 0) odd++;
        }
        System.out.println(odd);
        System.out.print("Сгенерированный массив: ");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\nМассив только из четных элементов: ");
        int[] new_arr = new int[odd];
        int counter = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                new_arr[counter] = arr[i];
                counter++;
                System.out.print(new_arr[counter - 1] + " ");
            }
        }
    }
}
