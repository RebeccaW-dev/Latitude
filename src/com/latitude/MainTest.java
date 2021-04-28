package com.latitude;

import java.util.Arrays;

class MainTest {


    public static void main(String[] args) {
        new MainTest().start();
    }

    private void start () {
        int[][][]testData={ {{5,11,6},{10,7,5,8,11,9}}, // {5,11,6} = Expected results = min=5,max=11,profit=6
                            {{5,11,6},{5,8,11}},
                            {{1,10,9},{100,1,5,10}}
            };
        System.out.println("testData="+testData.length);

        int i =0;
        for(int [][]currentTest: testData){
            System.out.println("currentTest="+currentTest.length);
            System.out.println("i="+i);
            i++;

            Main test = new Main();
            System.out.println("Running test "+i+",Test data="+ Arrays.toString(currentTest[1]));
            System.out.println("Expected results (min,max,profit)="+Arrays.toString(currentTest[0]));
            test.getMaxProfit(currentTest[1]);

            if (currentTest[0][0]==test.bestBuyingPrice) {
                System.out.println("bestBuyingPrice = PASS ,("+test.bestBuyingPrice+")");
            } else {
                System.out.println("bestBuyingPrice = FAIL ,("+test.bestBuyingPrice+")");
            }

            if (currentTest[0][1]==test.bestSellingPrice) {
                System.out.println("bestSellingPrice = PASS ,("+test.bestSellingPrice+")");
            } else {
                System.out.println("bestSellingPrice = FAIL ,("+test.bestSellingPrice+")");
            }

            if (currentTest[0][2]==test.bestProfit) {
                System.out.println("bestProfit = PASS ,("+test.bestProfit+")");
            } else {
                System.out.println("bestProfit = FAIL ,("+test.bestProfit+")");
            }
        }
    }
    }