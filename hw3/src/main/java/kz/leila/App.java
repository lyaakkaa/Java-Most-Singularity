package kz.leila;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        //guessNumberGame();
        guessWordGame();
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

    public static void guessWordGame() {
        Scanner scanner = new Scanner(System.in);
        Random rm = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String secretWord = words[rm.nextInt(words.length)];
        int len = secretWord.length();

        System.out.println("Загадано слово. Попробуйте угадать его.");

        while (true) {
            System.out.print("Введите ваше слово: ");
            String word = scanner.nextLine().toLowerCase();

            if (word.equals(secretWord)) {
                System.out.println("Поздравляю! Вы угадали слово!");
                break;
            } else {
                StringBuilder str = new StringBuilder("###############");
                for (int i = 0; i < Math.min(len, word.length()); i++) {
                    if (word.charAt(i) == secretWord.charAt(i)) {
                        str.setCharAt(i, secretWord.charAt(i));
                    }
                }
                System.out.println("Вы не угадали. Попробуйте еще. Подсказка: " + str);
            }
        }
    }
}
