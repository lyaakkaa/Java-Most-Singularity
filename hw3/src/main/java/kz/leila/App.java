package kz.leila;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        guessNumberGame();
    }

    public static void guessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(10);
        int attempts = 3;

        System.out.println("Загадано число от 0 до 9. У вас есть 3 попытки :)");

        while (attempts > 0) {
            System.out.print("Введите ваше число: ");
            int num = scanner.nextInt();

            switch (Integer.compare(num, secret)) {
                case 0:
                    System.out.println("Поздравляю! Вы угадали число!");
                    playAgain(scanner);
                    return;
                case 1:
                    System.out.println("Загаданное число меньше.");
                    break;
                case -1:
                    System.out.println("Загаданное число больше.");
                    break;
            }

            attempts--;
        }

        System.out.println("Вы проиграли. Загаданное число было: " + secret);
        playAgain(scanner);
    }

    public static void playAgain(Scanner scanner) {
        System.out.print("Хотите сыграть еще раз? (1 - да, 0 - нет): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            guessNumberGame();
        } else {
            System.out.println("Спасибо за игру!");
        }
    }
}
