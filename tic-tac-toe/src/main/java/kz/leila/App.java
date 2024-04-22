package kz.leila;

import java.util.Random;
import java.util.Scanner;

public class App {
    static char[][] map;
    static final int SIZE = 3;
    static final char DOT_PLAYER = 'X';
    static final char DOT_AI = '0';
    static final char DOT_EMPTY = '*';

    static final Scanner sc = new Scanner(System.in);

    static final Random random = new Random();

    public static void main(String[] args) {
        prepareMap();
        showMap();
        while (true) {
            playerTurn();
            showMap();

            if(isWinner(DOT_PLAYER)) {
                System.out.println("Победил игрок");
                break;
            }

            if(isDraw()) {
                System.out.println("Ничья");
                break;
            }

            botTurn();
            showMap();
            if(isWinner(DOT_AI)) {
                System.out.println("Победил БОТ");
                break;
            }

            if(isDraw()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static boolean isWinner(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if ((map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol) ||
                    (map[0][i] == symbol && map[1][i] == symbol && map[2][i] == symbol)) {
                return true;
            }
        }
        if ((map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) ||
                (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol)) {
            return true;
        }
        return false;
    }


    public static boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void botTurn() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_AI;
                    if (isWinner(DOT_AI)) {
                        System.out.printf("Ход ИИ: [%d, %d]\n", (j + 1), (i + 1));
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_PLAYER;
                    if (isWinner(DOT_PLAYER)) {
                        map[i][j] = DOT_AI;
                        System.out.printf("Ход ИИ: [%d, %d]\n", (j + 1), (i + 1));
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_AI;
        System.out.printf("Ход ИИ: [%d, %d]\n", (x + 1), (y + 1));
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_PLAYER;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void showMap(){
        for(int i = 0; i<= SIZE; i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");

        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void prepareMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
