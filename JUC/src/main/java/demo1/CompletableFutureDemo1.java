package demo1;

import com.sun.xml.internal.ws.util.StringUtils;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

//        案例說明：電商比價需求，模擬情況如下：
//        1.需求：
//         1.1 同一款產品，同時搜尋出同款產品在各大電商平台的售價；
//         1.2 同一款產品，同時搜尋出本產品在同一個電商平台下，各個進駐賣家售價為何
//
//        2.輸出：出來結果希望是同款產品的在不同地方的價格清單列表，回傳一個List<string>
//         <mysql> in jd price is 88.05
//         <mysql> in dangdang price is 86.11
//         <mysql> in taobao price is 90.43
//
//        3 技術要求
//         3.1 函數式編程
//         3.2 鍊式程式設計
//         3.3 Stream流式程式設計
public class CompletableFutureDemo1 {
    static List<NetMall> list = Arrays.asList(
            new NetMall("jd"),
            new NetMall("dangdang"),
            new NetMall("taobao")
    );



    /**
     * step by step 一家一家查
     * List<NetMall> ----> map ---> List<String>
     * @param list
     * @param productName
     * @return
     */
    public static List<String> getPrice(List<NetMall> list, String productName) {
        // <mysql> in jd price is 88.05
        return list
                .stream()
                .map(netMall -> {
                    return String.format(productName + " in %s price is %.2f",
                            netMall.getMallName(),
                            netMall.calcPrice(productName));
                })
                .collect(Collectors.toList());
    }

    /**
     * List<NetMall> ----> List<CompletableFuture<String>> ---> List<String>
     * @param list
     * @param productName
     * @return
     */
    public static List<String> getPriceByCompletableFuture(List<NetMall> list, String productName){
        return list.stream().map(netMall ->
                CompletableFuture.supplyAsync(() -> String.format(productName + " in %s price is %.2f",
                netMall.getMallName(),
                netMall.calcPrice(productName))))
                .collect(Collectors.toList())
                .stream()
                .map(s -> s.join())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        List<String> list1 = getPrice(list, "mysql");
        for (String s : list1) {
            System.out.println(s);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("---costTime: " + (endTime1 - startTime1) + "毫秒");

        long startTime2 = System.currentTimeMillis();
        List<String> list2 = getPriceByCompletableFuture(list, "mysql");
        for (String s : list2) {
            System.out.println(s);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("---costTime: " + (endTime2 - startTime2) + "毫秒");
    }
}

class NetMall{
    @Getter
    private String mallName;

    public NetMall(String mallName) {
        this.mallName = mallName;
    }

    public double calcPrice(String productName){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return ThreadLocalRandom.current().nextDouble() * 2 + productName.charAt(0);
    }
}
