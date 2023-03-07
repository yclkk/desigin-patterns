package com.zyc;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        double x = 10 * 10000 * 1.0;
        System.out.println(x);
        double cnt = Math.ceil(x / 10000);
        System.out.println(cnt);
        double times = Math.ceil(cnt);
        System.out.println(cnt);

    }

    private static void conv1ert(boolean flag) {
        flag = false;
    }

//    public static <E extends Comparable<E>> Stream<Optional<E>> max(Collection<E> c) {
//        return c.stream().max(Comparator.naturalOrder());
//    }
}
