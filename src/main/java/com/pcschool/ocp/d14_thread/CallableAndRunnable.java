
package com.pcschool.ocp.d14_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndRunnable {
    public static void main(String[] args) throws Exception {
        Runnable r = () -> {
            System.out.println("在 Runnable 中得到 Java");
        } ;   
        Callable<String> c = () -> {
            System.out.println("在 Callable 中得到 Pythoon");
            return "Pythoon";
         };   
          ExecutorService service = Executors.newCachedThreadPool();
          Future f1 = service.submit(r);
          Future f2 = service.submit(c);
          System.out.println(f1.get());
          System.out.println(f2.get());
          service.shutdown();
    }
}
