package com.example.mythread.a13waitandnotify;

public class Desk {

    /*
    * 作用：控制生產者和消費者的執行
    *
    * */

    //是否有麵條 0：沒有麵條 1：有麵條
    public static int foodFlag = 0;

    //總個數
    public static int count = 10;

    //鎖對象
    public static Object lock = new Object();


}
