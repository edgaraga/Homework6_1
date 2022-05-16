package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale; // sum = sum + sale
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public long averageSum(long[] sales) {
        double averageSum = sum (sales) / 12.0;
        return (long) Math.round(averageSum);
    }

    //Номер месяца в котором был пик продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //Номер месяца в котором был минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int belowAverageSum(long[] sales) {
        int belowAverageSum = 0;
        for (long sale : sales) {
            if (sale < averageSum(sales)) {
                belowAverageSum = belowAverageSum + 1;
            }
        }
        return belowAverageSum;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int aboveAverageSum(long[] sales) {
        int aboveAverageSum = 0;
        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                aboveAverageSum = aboveAverageSum + 1;
            }
        }
        return aboveAverageSum;
    }
}
