package com.multithreading.sandbox.benchmarks.runnable.java1.benchmark;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

public class CompFuture {

    private volatile double[][] someArray = new double[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];

    private Runnable r1 = () -> {
        // sparse matrix creation
        for (int i = 0; i < MATRIX_SIZE*MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE*MATRIX_SIZE; j++) {
                if (i==j) {
                    someArray[i][j] = 1.0;
                }
            }
        }
    };

    private Runnable r2 = () -> {
        //central diagonal
        for (int i = MATRIX_SIZE+1; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; i++) {
            for (int j = MATRIX_SIZE+1; j <MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; j++) {
                if (i==j) {
                    someArray[i][j] = 8.0;
                    if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
                        someArray[i][j] = 1.0;
                    }
                }
            }
        }
    };

    Runnable r3 = () -> {
        //TopWidthDiagonal
        for (int i = MATRIX_SIZE+1; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE; i++) {
            for (int j = MATRIX_SIZE+1; j < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE; j++) {
                if (i + 1 == j) {
                    someArray[i][j] = 3.0;
                    if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
                        someArray[i][j] = 0.0;
                    }
                }
            }

        }
    };

    Runnable r4 = () -> {
        //BottomWidthDiagonal
        for (int i = MATRIX_SIZE; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; i++) {
            for (int j = MATRIX_SIZE; j < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; j++) {
                if (j + 1 == i) {
                    someArray[i][j] = 3;
                    if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
                        someArray[i][j] = 0.0;
                    }
                }
            }
        }
    };

    Runnable r5 = () -> {
        //TopHeightDiagonal
        for (int i = MATRIX_SIZE+1; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE+3; i++) {
            for (int j = MATRIX_SIZE+1; j < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE+3; j++) {
                if (i + MATRIX_SIZE == j) {
                    someArray[i][j] = 5;
                    if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
                        someArray[i][j] = 0.0;
                    }
                }
            }
        }
    };

    Runnable r6 = () -> {
        //TopHeightDiagonal
        for (int i = 1; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; i++) {
            for (int j = 1; j < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; j++) {
                if (j + MATRIX_SIZE == i) {
                    someArray[i][j] = 5;
                    if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
                        someArray[i][j] = 0.0;
                    }
                }
            }
        }
    };


    public double[][] getAMatrix() {

        var futures = List.of(
                CompletableFuture.runAsync(r1),
                CompletableFuture.runAsync(r2),
                CompletableFuture.runAsync(r3),
                CompletableFuture.runAsync(r4),
                CompletableFuture.runAsync(r5),
                CompletableFuture.runAsync(r6)
        );
        futures.forEach(CompletableFuture::join);
        return someArray;
    }
}
