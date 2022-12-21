package ru.agcon.new_labs.laba3;

public class zadanie3 {
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++)
            arr[i] = (int)(Math.random() * 89) + 10;
        for(int i = 0; i < 4; i++)
            System.out.print(arr[i] + " ");
        boolean flag = true;
        for(int i = 0; i < 3; i++) {
            if (arr[i] < arr[i + 1])
                continue;
            else {
                flag = false;
                break;
            }
        }
        System.out.println();
        if (flag)
            System.out.print("\nМассив является строго возрастающей последовательностью");
        else
            System.out.print("\nМассив не является строго возрастающей последовательностью");
    }
}
