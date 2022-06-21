package com.multithreading.sandbox.tutorials.callable_future;

import java.util.concurrent.*;

public class AnotherExample {

    static Callable task = ()->{
       return 0;
    };


    static ExecutorService threadLauncher = Executors.newWorkStealingPool();


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(threadLauncher.submit(task).get());
        threadLauncher.shutdown();
    }



}
