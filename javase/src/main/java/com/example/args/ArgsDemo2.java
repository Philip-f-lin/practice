package com.example.args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        //可變參數的小細節：
        //1.在方法的形參中最多只能寫一個可變參數
        //可變參數，理解為一個大胖子，有多少吃多少
        //2.在方法的形參當中，如果出了可變參數以外，還有其他的形參，那麼可變參數要寫在最後

        int sum = getSum( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    }

    public static int getSum(int a, int ...args){
        return 0;
    }

}
