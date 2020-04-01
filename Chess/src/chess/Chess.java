package chess;

import java.util.Scanner;
import chess.Horse;

public class Chess {

    public static void main(String[] args) {                
        char xHorse='D';
        int yHorse=5;
        Coordinate EnumCoord = new Coordinate('C',7);
        System.out.println("Ваш конь стоит на D5. Вражеская Фигура стоит на С7. Ваш ход.");        
        System.out.println("Возможные ходы:");
        int xInt=0;
        switch(xHorse){
            case 'A': xInt=1;
            case 'B': xInt=2;
            case 'C': xInt=3;
            case 'D': xInt=4;
            case 'E': xInt=5;
            case 'F': xInt=6;
            case 'G': xInt=7;
            case 'H': xInt=8;
        }            
        System.out.println(new Horse(xInt,yHorse).M());
        System.out.println(trueXod(userXod(), EnumCoord));        
    }
    
    private static Coordinate userXod(){
        Scanner scan = new Scanner(System.in);
        try{
            char x;
            int y;
            while(true){
                System.out.print("Print 1 char [A-H]. X=");
                x = scan.nextLine().charAt(0);
                if((x>='A')&&(x<='H'))
                    break;
            }    
            while(true){
                System.out.print("Print 1 int [1-8]. Y=");
                y = scan.nextInt();
                if((y>=1)&&(y<=8))
                    break;
            }                             
            return new Coordinate(x,y);
        }
        catch(Exception ex){
            System.err.println(ex);
            return null;
        }        
    }
    
    private static boolean trueXod(Coordinate userXod, Coordinate TrueXod){
        return userXod.Sravnit_Coords(userXod, TrueXod);
    }
}

class Coordinate{

    private char x;
    private int y;
    public Coordinate(char x, int y) {
        this.x=x;
        this.y=y;
    }
    
    public boolean Sravnit_Coords(Coordinate c1, Coordinate c2){
        return ((c1.y==c2.y)&&(c1.x==c2.x));
    }
    
}
