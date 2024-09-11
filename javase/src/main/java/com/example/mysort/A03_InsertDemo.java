package com.example.mysort;

public class A03_InsertDemo {
    public static void main(String[] args) {
        /*
        插入排序：
            將0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最後一個當成是無序的。
            遍歷無序的數據，將遍歷到的元素插入有序序列中適當的位置，如遇到相同數據，插在後面。
            N的範圍：0~最大索引
        */

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        // 1.找出無序的數組是從哪個索引開始的
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }
        // 2.遍歷從startIndex開始到最後一個元素，依序得到無序的哪一組資料中的每一個元素
        for (int i = startIndex; i < arr.length; i++) {
            // 問題：如何把遍歷到的數據，插入到前面有序的這一組當中
            // 記錄目前要插入資料的索引
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                // 交換位置
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
