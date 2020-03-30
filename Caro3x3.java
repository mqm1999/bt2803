/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movegamereal;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Caro3x3 {
    static char[][] MAP = new char[3][3];
    static Scanner sc = new Scanner(System.in);
    static char PLAYER = 1;
    static int x,y;
    public static void main(String[] args) {
            for (int i = 0; i < MAP.length; i++) {
                for (int j = 0; j < MAP.length; j++) {
                    MAP[i][j] = '-';
                }
            }    
        while(true){
            show();
            move();
            if(checkCol()== MAP.length || checkRow() == MAP.length ||
               checkPDiagonal() == MAP.length || checkSDiagonal() == MAP.length)
            {
                System.out.println("Player" +PLAYER+ "win");
                break;
            }
            swap();
      }
    }
    static int checkRow() {
        int count = 0;
        for(int i = 0; i < MAP.length; i++){
            if(MAP[x][(y+i)%MAP.length] == PLAYER){
                count++;
            }
        }
        return count;
    }
    static int checkCol() {
        int count = 0;
        for(int i = 0; i < MAP.length; i++){
            if(MAP[(x+i)%MAP.length][y] == PLAYER){
                count++;
            }
        }
        return count;
    }
    static int checkPDiagonal() {
        int count = 0;
        for(int i = 0; i < MAP.length; i++){
            if(MAP[i][i] == PLAYER){
                count++;
            }
        }
        return count;
    }
    static int checkSDiagonal() {
        int count = 0;
        for(int i = 0; i < MAP.length; i++) {
            if (MAP[abs(MAP.length - i - 1)][i] == PLAYER){
                count++;
            }
        }
        return count;
    }

    static void move() {
        System.out.println("Nhap toa do (x:y) roi bam enter: ");
        String input = sc.nextLine();
        char xChar = input.charAt(0);
        char yChar = input.charAt(2);
        int x = (int) input.charAt(0) - 48;
        int y = (int) input.charAt(2) - 48;
        System.out.println(x);
        System.out.println(y);
        MAP[x][y] = PLAYER;
    }

    static void swap() {
        if(PLAYER == 'X')
        {
            PLAYER = 'O';
        }
        else
        {
            PLAYER = 'X';
        }
    }

    static void show() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
    
   