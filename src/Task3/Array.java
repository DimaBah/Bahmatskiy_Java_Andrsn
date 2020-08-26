package Task3;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arrayLen;
        Random rnd = new Random();
        arrayLen = rnd.nextInt(11) + 5;
        int[] numbers = new int[arrayLen];
        Scanner scan = new Scanner(System.in);
        System.out.println("Если хочешь вводить эелементы массива вручную, набери \"вручную\", иначе сгенерируются рандомно: ");
        String answer = scan.next();
        switch (answer) {
            case "вручную":
                try {
                    for (int i = 0; i < arrayLen; i++) {
                        System.out.print("Введи целое положительное число: ");
                        numbers[i] = scan.nextInt();
                    }
                }catch (Exception ex){
                    System.out.println("Неправильный формат данных...");
                }
                break;
            default :
                for (int i = 0; i < arrayLen; i++) {
                    numbers[i] = rnd.nextInt(99);
                }
        }

        System.out.print("Массив: ");
        for (int item : numbers){
            System.out.print(item + "  ");
        }
        System.out.println();
        System.out.print("Элементы, кратные 3: ");
        for (int item : numbers){
            if((item % 3) == 0) {
                System.out.print(item + "  ");
            }
        }
    }
}
