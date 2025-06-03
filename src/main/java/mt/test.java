package mt;

import java.sql.Array;

public class test {

    public static void main(String[] args) {
        int[] arr ={1,4,4,6,10};
        int i = maxProfit(arr);
        System.out.println(i);
    }

    /**
     * 假设你有一个数组prices，长度为n，其中prices[i]是股票在第i天的价格，请根据这个价格数组，返回买卖股票能获得的最大收益
     * 1.你可以买入一次股票和卖出一次股票，并非每天都可以买入或卖出一次，总共只能买入和卖出一次，且买入必须在卖出的前面的某一天
     * 2.如果不能获取到任何利润，请返回0
     * 3.假设买入卖出均无手续费
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            // 维护历史最低价
            if (price < min) {
                min = price;
            } else {
                // 计算当前卖出的利润
                int profit = price - min;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
