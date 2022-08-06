import java.util.Scanner;
public class Game {
        Scanner in=new Scanner(System.in);
        public static void main(String[] args) {
            for (int a=0;a<5;a++){
                if (a%2==0){
                    System.out.println(" | | ");
                }
                else {
                    System.out.println("-------");
                }
            }
        }
    }