package Task2;

import java.util.Scanner;

public class Slava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи имя: ");
        String name = scan.next();
        if (name.equalsIgnoreCase("Вячеслав")){ //учтем вариант с маленькой буквы
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
