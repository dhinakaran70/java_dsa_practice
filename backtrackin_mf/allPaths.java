package backtrackin_mf;

public class allPaths {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        maze("",board,0,0);

    }
    static void maze(String p , boolean[][] b, int r, int c){
        if(r==b.length-1&& c==b[0].length-1){
            System.out.println(p);
            return ;
        }
     if(b[r][c]==false) return;
     b[r][c]=false;
        if(r<b.length-1){
            maze(p+'D',b,r+1,c);
        }
        if(c<b[0].length-1){
            maze(p+'R',b,r,c+1);
        }
        if(r>0){
            maze(p+'U',b,r-1,c);
        }
        if(c>0){
            maze(p+'L',b,r,c-1);
        }

       b[r][c]=true;

    }
}
