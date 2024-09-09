package com.example.search;

public class A03_BlockSearchDemo2 {
    public static void main(String[] args) {
        /*分塊查找
        核心思想：
        塊內無序，塊間有序實現步驟：
        1.建立數組blockArr存放每個區塊物件的信息
        2.先找blockArr確定要找的資料屬於哪一塊
        3.再單獨遍歷這一塊數據即可*/

        int[] arr = {27, 22, 30, 40, 36,
                    13, 19, 16, 20,
                    7, 10,
                    43, 50, 48};

        Block2 b1 = new Block2(40, 22, 0, 4);
        Block2 b2 = new Block2(20, 13, 5, 8);
        Block2 b3 = new Block2(10, 7, 9, 10);
        Block2 b4 = new Block2(50, 43, 11, 13);

        Block2[] blockArr = {b1, b2, b3, b4};

        int number = 50;

        int index = getIndex(arr, blockArr, number);

        System.out.println(index);

    }

    public static int getIndex(int[] arr, Block2[] blockArr, int number){
        Block2 block2 = getBlock(blockArr, number);
        for (int i = block2.getStartIndex(); i <= block2.getEndIndex(); i++) {
            if(number == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static Block2 getBlock(Block2[] blockArr, int number){
        for (int i = 0; i < blockArr.length; i++) {
            int min = blockArr[i].getMin();
            int max = blockArr[i].getMax();
            if (number >= min && number <= max){
                return blockArr[i];
            }
        }
        return null;
    }


}

class Block2{
    private int max; // 最大值
    private int min; // 最小值
    private int startIndex; // 起始索引
    private int endIndex; // 結束索引

    public Block2() {
    }

    public Block2(int max, int min, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
