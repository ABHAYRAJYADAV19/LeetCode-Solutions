class Solution {
    public boolean isValidSudoku(char[][] board) {
        //rows
        for(int i=0;i<9;i++){
            HashSet<Character> s1=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(s1.contains(board[i][j])){
                        return false;
                    }
                }
                s1.add(board[i][j]);
            }
        }
        //colm
        for(int j=0;j<9;j++){
            HashSet<Character> s2=new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j]!='.'){
                    if(s2.contains(board[i][j])){
                        return false;
                    }
                }
                s2.add(board[i][j]);
            }
        }
        //3*3 grid
        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){
                HashSet<Character> s3=new HashSet<>();
                for(int i=row;i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]!='.'){
                            if(s3.contains(board[i][j])){
                                return false;
                            }
                        }
                        s3.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}