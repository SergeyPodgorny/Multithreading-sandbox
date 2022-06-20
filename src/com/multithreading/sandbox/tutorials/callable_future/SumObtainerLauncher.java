package com.multithreading.sandbox.tutorials.callable_future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class SumObtainerLauncher {


    static Future<Double> calculator = new SumObtainer(2.5,3.7).calculateSum();


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        while(!calculator.isDone()){
            System.out.println("calculating...");
        }

        System.out.println(calculator.get());


    }


}
