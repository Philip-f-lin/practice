package com.example.search;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找範圍
        //需求：定義一個方法利用二分查找，查詢某個元素在陣列中的索引
        //資料如下： {7,23,79,81,103,127,131,147}

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 150;
        System.out.println(binarySearch(arr, number));
    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }
            int middle = (min + max) / 2;

            if (number > arr[middle]) {
                min = middle + 1;
            } else if (number < arr[middle]) {
                max = middle - 1;
            } else {
                return middle;
            }
        }
    }
}
