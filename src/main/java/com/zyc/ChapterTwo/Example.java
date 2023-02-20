package com.zyc.ChapterTwo;

public class Example {
    public static void main(String[] argss) {
        DynamicArray dynamicArray = new SortedArray();
        test(dynamicArray);

    }

    public static void test(DynamicArray dynamicArray) {
        dynamicArray.add(1);
        dynamicArray.add(3);
        dynamicArray.add(2);
        dynamicArray.add(7);
        dynamicArray.add(2);
        dynamicArray.add(4);
        dynamicArray.add(6);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(20);
        dynamicArray.add(14);
        for (int i = 0; i < dynamicArray.size; i++) {
            System.out.println(dynamicArray.elements[i]);
        }
    }
}
