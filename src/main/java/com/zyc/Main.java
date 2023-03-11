package com.zyc;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture future = service.schedule(() -> {
            System.out.println("1");
            try {
                Thread.sleep(3000);
                System.out.println("2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("task finsh time is: " + format.format(System.currentTimeMillis()));
        }, 0, TimeUnit.MILLISECONDS);

        System.out.println("schedule finish time: " + format.format(System.currentTimeMillis()));

        System.out.println("Runnable feature's result is: " + future.get() +
                "and current time is: " + format.format(System.currentTimeMillis()));

    }


}
