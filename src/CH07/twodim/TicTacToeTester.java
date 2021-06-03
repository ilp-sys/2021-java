package CH07.twodim;

import java.util.Scanner;

public class TicTacToeTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String player = "x";
        TicTacToe game = new TicTacToe();

        boolean done = false;

        while(!done){
            System.out.println(game.toString());
            System.out.println("(-1 to exit):");
            System.out.println("Row for" + player + ": ");
            int row = in.nextInt();

            if(row < 0)
                done = true;
            else{
                System.out.println("Col for" + player + ":");
                int col = in.nextInt();
                game.setBoard(row, col, player);

                if(player.equals("x"))
                    player = "o";
                else
                    player = "x";
            }
        }
    }
}
