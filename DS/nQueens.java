import java.util.*;

public class nQueens {
    public static void saveboard(char[][] board,List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q') {
                    row+='Q';
                }
                else{ 
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }


    public static boolean isSafe(int row,int col,char[][] board){
        //v
        for(int i=0;i<board.length;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //h
        for(int i=0;i<board.length;i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }
        //upper left
        int r=row;
        for(int c=col;r>=0 && c>=0;c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
        r=row;
        for(int c=col;r>=0 && c<board.length;c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower left
        r=row;
        for(int c=col;c>=0 && r<board.length;c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right
        r=row;
        for(int c=col;r<board.length && c<board.length;c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }


    public static void helper(List<List<String>> allBoards, char[][] board, int col){
        if(col==board.length){
            saveboard(board,allBoards);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(allBoards, board, col+1);
                board[row][col]='.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(allBoards,board,0);  

        return allBoards;
    }

    public static void main(String[] args) {
        List<List<String>> allBoards = new ArrayList<>();
        allBoards = solveNQueens(4);
        System.out.println(allBoards);
    }
}



