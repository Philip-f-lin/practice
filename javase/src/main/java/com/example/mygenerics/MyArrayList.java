package com.example.mygenerics;

import java.util.Arrays;

/**
 * 當我在寫一個類別的時候，如果不確定類型，那麼這個類別就可以定義為泛型類
 * @param <E>
 */
public class MyArrayList<E> {

    private Object[] obj = new Object[10];
    private int size;

    /*
    E：表示是不確定的類型。類型在類別名稱後面已經定義過了。
    e： 形參的名字，變量名稱
    */
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
