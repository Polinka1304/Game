import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро Пожаловать в игру Кресты-Нули \n От создателя:ПОЛИНКИ");

        Gamers move = new Gamers();
        System.out.println("Итак..Ваше поле для игры!");
        move.scheme();
        System.out.println("Выберите режим игры:\n 1 - два игрока, 2 - один игрок");
        int r=in.nextInt();
        if (r==1) {

            for (int i = 0; i < 4; i++) {
                move.gamer1();
                move.scheme();
                move.result();
                move.gamer2();
                move.scheme();
                move.result();
            }
            move.gamer1();
        }
        if (r==2) {

            for (int i = 0; i < 4; i++) {
                move.gamer1();
                move.scheme();
                move.result();
                move.computer();
                move.scheme();
                move.result();
            }
            move.gamer1();
        }
    }
}
class Gamers {
    Scanner in = new Scanner(System.in);
    char[][] position = new char[][]{{49, 50, 51}, {52, 53, 54}, {55, 56, 57}};
    void scheme() {
        for (int i = 0; i < position.length; i++) {
            System.out.println();
            for (int j = 0; j < position.length; j++) {

                System.out.print("| " + position[i][j] + " |");
            }
            System.out.println("\n--------------");
        }
    }

    public void gamer1() {
        System.out.println("Игрок 1!Введите номер свободного поля от 1 до 9");
        int a = in.nextInt();
        char b=(char)(a+'0');
        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < position.length; j++) {
                if (b == position[i][j]) {
                    position[i][j]=120;
                }
            }
        }
    }

    public void gamer2() {
        System.out.println("Игрок 2! Введите номер свободного поля от 1 до 9");
        int c = in.nextInt();
        int d=(char)(c+'0');
        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < position.length; j++) {
                if (d == position[i][j]) {
                    position[i][j] = 111;
                }
            }
        }
    }
    public void computer() {
        Random random = new Random();
        int k = random.nextInt(2)+2;
        System.out.println(k);
        int l = (char) (k + '0');
        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < position.length; j++) {
                if (l == position[i][j]) {
                    position[i][j] = 111;
                }
            }
        }
    }
    public void result() {
        if (position[0][0] == 120 && position[0][1] == 120 && position[0][2] == 120) {
            System.out.println("Победа игрока 1!");
            System.exit(0);
        }
        if (position[1][0] == 120 && position[1][1] == 120 && position[1][2] == 120) {
            System.out.println("Победа игрока 1!");
            System.exit(0);
        }
        if (position[2][0] == 120 && position[2][1] == 120 && position[2][2] == 120) {
            System.out.println("Победа игрока 1!");
            System.exit(0);
        }
        if (position[0][0] == 120 && position[1][0] == 120 && position[2][0] == 120) {
            System.out.println("Победа игрока 1!");
            System.exit(0);
        }
        if (position[0][1] == 120 && position[1][1] == 120 && position[2][1] == 120) {
            System.out.println("Победа игрока 1!");
            System.exit(0);
        }
        if (position[0][2] == 120 && position[1][2] == 120 && position[2][2] == 120) {
            System.out.println("Победа игрока 1!");
            System.exit(0);
        }

        if (position[0][2] == 111 && position[1][1] == 111 && position[2][0] == 111) {
            System.out.println("Победа игрока 1!");
            System.exit(0);
        }
        if (position[0][0] == 111 && position[0][1] == 111 && position[0][2] == 111) {
            System.out.println("Победа игрока 2!");
            System.exit(0);
        }
        if (position[1][0] == 111 && position[1][1] == 111 && position[1][2] == 111) {
            System.out.println("Победа игрока 2!");
            System.exit(0);
        }
        if (position[2][0] == 111 && position[2][1] == 111 && position[2][2] == 111) {
            System.out.println("Победа игрока 2!");
            System.exit(0);
        }
        if (position[0][0] == 111 && position[1][0] == 111 && position[2][0] == 111) {
            System.out.println("Победа игрока 2!");
            System.exit(0);
        }
        if (position[0][1] == 111 && position[1][1] == 111 && position[2][1] == 111) {
            System.out.println("Победа игрока 2!");
            System.exit(0);
        }
        if (position[0][2] == 111 && position[1][2] == 111 && position[2][2] == 111) {
            System.out.println("Победа игрока 2!");
            System.exit(0);
        }

        if (position[0][2] == 111 && position[1][1] == 111 && position[2][0] == 111) {
            System.out.println("Победа игрока 2!");
            System.exit(0);
        }
  }
}