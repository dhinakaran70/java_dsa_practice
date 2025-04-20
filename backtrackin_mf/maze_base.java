package backtrackin_mf;

import java.util.ArrayList;

public class maze_base {
    public static void main(String[] args) {
        System.out.println(maze("",3,3));

    }
    static ArrayList<String> maze(String p ,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r==2 && c==2){
            return list ;
        }
        if(r>1){
           list.addAll(maze(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(maze(p+'R',r,c-1));
        }

        return list;

    }
}
