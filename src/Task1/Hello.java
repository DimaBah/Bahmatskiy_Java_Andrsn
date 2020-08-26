package Task1;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(20) - 5; //берем случайное значение
        if (number > 7){
            System.out.printf("Случайное число: %d. Так что, привет!\n", number);
        } else{
            System.out.println("Случайное число " + number + " не больше 7. Поэтому - не привет. :(");
        }

        try (Scanner scan = new Scanner(System.in)){ //сканер не требует закрытия, просто для демонстрации нубских знаний:)
            System.out.println("Введи свое число (дробная часть через запятую!): ");
            double consoleNumber = scan.nextDouble(); //берем значение с консоли
            System.out.println(consoleNumber > 7 ? "Привет." : "Не привет...");
        } catch(Exception ex){
            System.out.println("Неправильный формат данных...");
        } finally {
            System.out.println("Программа завершена. Пока!");
        }

    }
}
