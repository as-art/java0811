package com.pcschool.ocp.d14_thread;

public class Race extends Thread {
    private static boolean gameover;
    private boolean ture;
    public Race(String string) {
        super(string);
    }

    @Override
    public void run() {
        job();
    }
    
    private void job() {
        String tName = Thread.currentThread().getName();
        for(int i=1;i<=1000 && gameover;i++) {
            System.out.printf("%s 跑了 %d 步\n", tName, i);
        }
       
           
    }
    
}
