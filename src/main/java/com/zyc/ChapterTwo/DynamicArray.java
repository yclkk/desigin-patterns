package com.zyc.ChapterTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public List<Integer> list = new ArrayList<>();
    public static final int DEFAULT_CAPACITY = 10;
    public int size = 0;
    public int capacity = DEFAULT_CAPACITY;
    public Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public void add(Integer e) {
        ensureCapacity();
        elements[size ++] = e;
    }

    /**
     * 扩容
     */
    public void ensureCapacity() {
        int oldCapacity = elements.length;
        if (size >= oldCapacity) {
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

}
