import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
        scheme();
        Gamers tom = new Gamers();
        for (int i = 0; i < 4; i++) {
            tom.gamer1();
            tom.gamer2();
        }
    }
    public static void scheme() {
        for (int a = 0; a < 5; a++) {
            if (a % 2 == 0) {
                System.out.println(" | | ");
            } else {
                System.out.println("-------");
            }
        }
    }
}
class Gamers{
    Scanner in = new Scanner(System.in);
        public void gamer1 () {
        System.out.print("Игрок 1:");
        String gamer1 = in.nextLine();
    }
        public void gamer2 () {
        System.out.print("Игрок 2:");
        String gamer2 = in.nextLine();
    }
}