package com.kgisl.brokerapp;

public class Trade{
    Customer aCustomer;
    String symbol;
    Integer qty;
    Double rate;
    Double amount;
    Trade(Customer aCustomer,String symbol,Integer qty,Double rate){
        this.aCustomer = aCustomer;
        this.symbol = symbol;
        this.qty = qty;
        this.rate = rate;
        this.amount = this.qty*this.rate;
    }
    public String toString(){
        return this.aCustomer.toString()+"\t"+this.symbol+"\t"+this.qty+"\t"+this.rate;
    }
    public String getSymbol(){
        return this.symbol;
    }
}