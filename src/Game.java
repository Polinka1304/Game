import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        int [][] position=new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<position.length;i++){
            System.out.println();
            for(int j=0;j<position.length;j++){
                System.out.print("| "+position[i][j]+" |");
            }
            System.out.println("\n--------------");
        }
        Gamers move = new Gamers();
        for (int i = 0; i < 4; i++) {
            move.gamer1();
            move.gamer2();
        }
        }
    }
class Gamers {
    Scanner in = new Scanner(System.in);
    public String gamer1() {
        System.out.print("Введите номер свободного поля от 1 до 9");
        int a = in.nextInt();
        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < position.length; j++) {
                if (a == int position[ i][j]){
                    return "o";
                }
            }
        }
    }
        public String gamer2 () {
        System.out.print("Игрок 2:");
        String gamer2 = in.nextLine();
        return "x";
    }
}