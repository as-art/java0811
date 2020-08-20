package com.pcschool.ocp.d01.d02;

public class MultArray53 {

    public static void main(String[] args) {
        char[][] ttt = {
            {'O', 'O', 'X'},
            {'X', 'O', ' '},
            {'X', ' ', 'X'}
        };
        int x = 7;
        ttt[x/3][x%3] = 'O';
        System.out.println("O 勝利");
        for(int i=0;i<ttt.length;i++) {
            System.out.println(ttt[i]);
        }
    }
       
}
