package com.example.search;

public class A03_BlockSearchDemo {
    public static void main(String[] args) {
        /*分塊查找
        核心思想：
        塊內無序，塊間有序實現步驟：
        1.建立數組blockArr存放每個區塊物件的信息
        2.先找blockArr確定要找的資料屬於哪一塊
        3.再單獨遍歷這一塊數據即可*/

        int[] arr = {16, 5, 9, 12, 21, 18,
                    32, 23, 37, 26, 45, 34,
                    50, 48, 61, 52, 73, 66};

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);
        // 定義數組用來管理三個區塊的物件（索引表)
        Block[] blockArr = {b1, b2, b3};
        // 定義一個變數用來記錄要找的元素
        int number = 32;
        // 呼叫方法，傳遞索引表，數組，要尋找的元素
        int index = getIndex(arr, blockArr, number);

        System.out.println(index);

    }

    // 利用分塊查找的原理，查詢number的索引
    public static int getIndex(int[] arr, Block[] blockArr, int number){
        // 1.確定number是在那一塊當中
        int indexBlock = findIndexBlock(blockArr, number);
        if (indexBlock == -1){
            // 表示number不在數組當中
            return -1;
        }

        // 2. 取得這一塊的起始索引和結束索引
        Block block = blockArr[indexBlock];
        int startIndex = block.getStartIndex();
        int endIndex = block.getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    // 定義一個方法，用來確定number在哪一塊當中
    public static int findIndexBlock(Block[] blockArr, int number){
        // 從0素引開始遍歷blockArr，如果number小於max，那麼就表示number是在這一塊當中
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}

class Block{
    private int max; // 最大值
    private int startIndex; // 起始索引
    private int endIndex; // 結束索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
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
