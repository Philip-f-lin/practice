package com.example.mysort;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
        /*
        快速排序：
            第一輪：以0索引的數字為基準數，決定基準數在陣列中正確的位置。
            比基準數小的全部在左邊，比基準數大的全部在右邊。
            後面以此類推
        */

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int i, int j){
        int start = i;
        int end = j;

        int basePoint = arr[i];
        while(start != end){
            while(true){
                if(end <= start || basePoint > arr[end]){
                    break;
                }
                end--;
            }
            while(true){
                if(end <= start || basePoint < arr[start]){
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
    }
}
