package ru.netology.stats.task1.services;

public class StatsService {

    public int sumSales(long[] sales) {
        int allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    public int averageSales(long[] sales) {
        int length = sales.length;
        int allSales = sumSales(sales);
        return allSales/length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int upperAverageSales(long[] sales) {
        int countMonth = 0;
        int averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                countMonth += 1;
            }
        }
        return countMonth;
    }

    public int lowerAverageSales(long[] sales) {
        int countMonth = 0;
        int averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                countMonth += 1;
            }
        }
        return countMonth;
    }
}
