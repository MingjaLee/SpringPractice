package com.smart;

/**
 * @author jerry
 * @create 17/6/28 14:34
 */
public class SmallSeller implements Seller {
    public int sell(String goods, String clientname) {
        System.out.println("SmallSeller: sell " + goods + " to " + clientname + "...");
        return 100;
    }

    public void checkBill(int billId) {
        if(billId == 1) throw new IllegalArgumentException("iae Exception");
        else throw new RuntimeException("re Exception");
    }
}
