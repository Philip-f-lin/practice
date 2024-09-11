package com.example.mysort;

public class A02_SelectionDemo {
    public static void main(String[] args) {
        /*
        選擇排序：
        1，從0索引開始，跟後面的元素一一比較。
        2，小的放前面，大放的後面。
        3，第一次循環結束後，最小的數據已經確定。
        4，第二次循環從1索引開始以此類推
        */

        // 1. 定義數組
        int[] arr = {2, 4, 5, 3, 1};

        //外循環：幾輪
        //j：表示這一輪中，我拿著哪個索引上的資料跟後面的資料比較並交換
        for (int j = 0; j < arr.length - 1; j++) {
            //內循壞：每一輪我要做什麼事情？
            //拿著j跟j後面的數據進行比較交換
            for (int i = j + 1; i < arr.length; i++) {
                if(arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
