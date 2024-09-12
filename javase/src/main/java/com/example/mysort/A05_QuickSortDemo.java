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

    /*
    參數一：我們要排序的陣列
    參數二：要排序陣列的起始索引
    參數三：要排序陣列的結束索引
     */
    public static void quickSort(int[] arr, int i, int j){
        // 定義兩個變數記錄要尋找的範圍
        int start = i;
        int end = j;

        if(start > end){
            // 遞歸的出口
            return;
        }

        // 記錄基準數
        int basePoint = arr[i];
        // 利用循環找到要交換的數字
        while(start != end){
            // 利用end，從後往前開始找，找比基準數小的數字
            while(true){
                if(end <= start || basePoint > arr[end]){
                    break;
                }
                end--;
            }
            //  利用start，从前往后找，找比基准数大的数字
            while(true){
                if(end <= start || basePoint < arr[start]){
                    break;
                }
                start++;
            }
            // 把end和start指向的元素交換
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //當start和end指向了同一個元素的時候，那麼上面的循環就會結束
        //表示已經找到了基準數在數組中應存入的位置
        //基淮數歸位
        //就是拿著這個範圍中的第一個數字，跟start指向的元素交換
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        // 確定6左邊的範圍，重複剛剛所做的事
        quickSort(arr, i, start -1);
        // 確定6右邊的範圍，重複剛剛所做的事
        quickSort(arr, start + 1, j);
    }
}
