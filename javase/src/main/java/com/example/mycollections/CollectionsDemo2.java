package com.example.mycollections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
      /*
        public static <T> void sort(List<T> list)                       排序
        public static <T> void sort(List<T> list, Comparator<T> c)      根據指定的規則進行排序
        public static <T> int binarySearch (List<T> list,  T key)       以二分查找法找出元素
        public static <T> void copy(List<T> dest, List<T> src)          拷貝集合中的元素
        public static <T> int fill (List<T> list,  T obj)               使用指定的元素填充集合
        public static <T> void max/min(Collection<T> coll)              根據預設的自然排序取得最大/小值
        public static <T> void swap(List<?> list, int i, int j)         交換集合中指定位置的元素
     */


        System.out.println("-------------sort預設規則--------------------------");
        //預設規則，需要重寫Comparable介面compareTo方法。 Integer已經實現，按照從小打大的順序排列
        //如果是自訂對象，需要自己指定規則
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 10, 1, 2, 4, 8, 5, 9, 6, 7, 3);
        Collections.sort(list1);
        System.out.println(list1);



        System.out.println("-------------sort自己指定規則--------------------------");
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1);

        Collections.sort(list1, (o1, o2) -> o2 - o1);
        System.out.println(list1);

        System.out.println("-------------binarySearch--------------------------");
        //需要元素有序
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.binarySearch(list2, 9));
        System.out.println(Collections.binarySearch(list2, 1));
        System.out.println(Collections.binarySearch(list2, 30));

        System.out.println("-------------copy--------------------------");
        //把 list 3 中的元素拷貝到 list 4 中
        //會覆蓋原來的元素
        //注意點：如果 list 3 的長度 > list 4 的長度，方法會報錯
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(list4, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        Collections.copy(list4, list3);
        System.out.println(list3);
        System.out.println(list4);

        System.out.println("-------------fill--------------------------");
        //把集合中現有的所有數據，都修改為指定數據
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.fill(list5, 100);
        System.out.println(list5);

        System.out.println("-------------max/min--------------------------");
        //求最大值或者最小值
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.max(list6));
        System.out.println(Collections.min(list6));

        System.out.println("-------------max/min指定規則--------------------------");
        // String中預設是按照字母的abcdefg順序排列的
        // 現在我要求最長的字串
        // 預設的規則無法滿足，可以自行指定規則
        // 求指定規則的最大值或最小值
        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7, "a","aa","aaa","aaaa");
        System.out.println(Collections.max(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }));

        System.out.println("-------------swap--------------------------");
        ArrayList<Integer> list8 = new ArrayList<>();
        Collections.addAll(list8, 1, 2, 3);
        Collections.swap(list8,0,2);
        System.out.println(list8);



    }
}
