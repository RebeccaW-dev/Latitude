package com.latitude;
import java.util.Arrays;

public class Main {
    int bestSellingPrice = 0;
    int bestBuyingPrice = 0;
    int bestProfit = 0;

    public int getMaxProfit( int[] stockPrices) {
        int curnum = 0;
        for (int n = 0; n < stockPrices.length; n++) {
            curnum = stockPrices[n]; //current price
            int[] slice = Arrays.copyOfRange(stockPrices, n + 1, stockPrices.length); //Slice the array to iterate it through
            for (int num : slice) {
                if (num - curnum > bestProfit) {
                    bestBuyingPrice = curnum;
                    bestSellingPrice = num;
                    bestProfit = bestSellingPrice - bestBuyingPrice;
                }
            }
        }
        return bestProfit;
    }
    public static void main(String[] args) {
        new Main().start();
    }
        private void start (){
             int[] stockPrices = {10, 7, 5, 8, 11, 9};
            getMaxProfit(stockPrices);
            System.out.println("bestProfit=" +  bestProfit + " , bestBuyingPrice="+ bestBuyingPrice+ ", bestSellingPrice="+bestSellingPrice);
        }
    }


