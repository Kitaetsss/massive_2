package ru.skypro;

public class Main {
    public static void main(String[] args) {
        // задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //задание 2
        int max = arr[1];
        int min = arr[1];
        for (int a = 1; a <= arr.length; a++) {
            if (max < arr[a-1]) {
                max = arr[a-1];
            }
            if (min > arr[a-1]) {
                min = arr[a-1];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        // задание 3
        var between = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + between + " рублей");
        // задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String result = "";
        int x = reverseFullName.length - 1;
        for (; x >= 0; x--){
            result = result + reverseFullName[x];
        }
        System.out.println(result);
    }
public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
