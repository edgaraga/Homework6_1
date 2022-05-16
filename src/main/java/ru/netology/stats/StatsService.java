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
        long sum = 0;
        double averageSum = 0;
        for (long sale : sales) {
            sum += sale; // sum = sum + sale
        }
        averageSum = sum / 12.0;
        return (long) Math.round(averageSum);
    }

    //Номер месяца в котором был пик продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
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
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int belowAverageSum(long[] sales) {
        long sum = 0;
        double averageSum = 0;
        for (long sale : sales) {
            sum += sale; // sum = sum + sale
        }
        averageSum = sum / 12.0;
        averageSum = (long) Math.round(averageSum);
        int belowAverageSum = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                belowAverageSum = belowAverageSum + 1;
            }
        }
        return belowAverageSum;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int aboveAverageSum(long[] sales) {
        long sum = 0;
        double averageSum = 0;
        for (long sale : sales) {
            sum += sale; // sum = sum + sale
        }
        averageSum = sum / 12.0;
        averageSum = (long) Math.round(averageSum);

        int aboveAverageSum = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                aboveAverageSum = aboveAverageSum + 1;
            }
        }
        return aboveAverageSum;
    }
}
