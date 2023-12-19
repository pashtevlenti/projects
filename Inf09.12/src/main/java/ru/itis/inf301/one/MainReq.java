package ru.itis.inf301.one;

public class MainReq {
    public static void main(String[] args){
        TradeRequest trade = new TradeRequest(-2,"-3");
        trade.registerTrade();
    }
}
