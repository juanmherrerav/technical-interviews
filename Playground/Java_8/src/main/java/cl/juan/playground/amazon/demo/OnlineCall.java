package cl.juan.playground.amazon.demo;

import java.util.ArrayList;
import java.util.List;


/*
Given a list of historic stock prices, write a function that tells when
you should have bought and sold to make the most profit.

1.- Same company
2.- Stock Prices.
3.- Stock -> Day
4.- Buy Day, before Sell Day.
5.- Assume that i dont need to track the day only sequential order.
6.- optimize for the highest profit.
7.- 1 -> buy and 1 Sel Positions (Days).
8.- List of Prices (could be small or large)
9.- Input -> List<Double>
10.- return type List <Integer>

current : Square


order biggest to lowst : N Log N
order lowets to Bigget : N Log N

Best Profit = Higest minus lowest *
Check Highes before lowest
Order : 2 * N Log N




public List<Integer> getHighestProfit(List<Double> stockPriceList){
    if (boundaryChecks(stockPriceList)){
        return null;
    }
    int bestBuyDay;
    int bestSellDay;
    double bestProfit=-999999999;



    for (int i= 0; i<stockPriceList.size()-1;i++ ){
            for (int j= 1; j<stockPriceList.size();j++ ){
                if (i<>j){
                    double currentProfit=stockPriceList.get(j)-stockPriceList.get(i);
                    if (currentProfit>bestProfit){
                        bestBuyDay=i;
                        bestSellDay=j
                        bestProfit=currentProfit;
                    }
                }
            }
    }
    return Arrays.asList(bestBuyDay,bestSellDay);
}

public boolean boundaryChecks(List<Double> stockPriceList){
    return false;
}

Dynamic Programing??
*

**/
public class OnlineCall {
    public List<Integer> getHighestProfit(List<Double> stockPriceList){
        List<Integer> result = new ArrayList<>();

        for (int i= 0; i<stockPriceList.size()-1;i++ ){
            for (int j= 1; j<stockPriceList.size();j++ ){
                double currentProfit=stockPriceList.get(j);

            }
        }
        return null;
    }



}
