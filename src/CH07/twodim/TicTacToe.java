package CH07.twodim;

public class TicTacToe {
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLS = 3;

    public TicTacToe(){
        board = new String[ROWS][COLS];

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                board[i][j] = " ";
            }
        }
    }

    public void setBoard(int i, int j, String player){
        if(board[i][j] == " ")
            board[i][j] = player;
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < ROWS; i++){
            str = str + "|";
            for(int j = 0; j < COLS; j++)
                str = str + board[i][j];
            str = str + "|\n";
        }
        return str;
    }
}
