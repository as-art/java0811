
package com.pcschool.ocp.d14_thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo2 {
    public static void main(String[] args) throws Exception {
        Callable<Integer> x = () -> new Random().nextInt(10);
        Callable<Integer> y = () -> new Random().nextInt(9) + 1;
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = service.submit(x);
        Future<Integer> f2 = service.submit(y);
        // 得到結果
        int x_value = f1.get();
        int y_value = f2.get();
        // 列印結果
        System.out.println(y_value * 10 + x_value);
    }
}
