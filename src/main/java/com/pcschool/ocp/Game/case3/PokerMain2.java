
package com.pcschool.ocp.Game.case3;

import java.util.Scanner;

public class PokerMain2 {
   
        public static void main(String[] args) throws Exception {
        // 指定檔案位置
        File f = new File("src\\main\\java\\com\\pcschool\\ocp\\game\\case3\\poker.txt");
        // 透過 Scanner 抓取檔案內容
        Scanner sc = new Scanner(f);
        // 將檔案內容全部
        String allData = sc.useDelimiter("\\A").next();
        // 列印
        System.out.println(allData);
        String[] rows = allData.split("\n");
        System.out.println( rows[0]);
        String mark = rows[0];
        String number = rows[1];
        String color  = rows[2];
        int value = Integer.parseInt(rows[3]);
        System.out.printf("mark: %s number: %s color:%s value:%d\n", mark, number, color, value);
        Poker p1 = new Poker(mark, number, color, value);
        System.out.println(p1.mark);
        System.out.println(p1.number);
        System.out.println(p1.color);
        System.out.println(p1.value);
        
    }
}
