import ru.netology.stats.StatsService;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long totalOfAllSales = service.sum(sales);                                        // Сумма всех продаж
        long averageAmountOfSalesPerMonth = service.averageSum(sales);                    // Средняя сумма продаж в месяц
        int theNumberOfTheMonthInWhichTheSalesPeakWas = service.maxSales(sales);         // Номер месяца в котором был пик продаж
        int theNumberOfTheMonthInWhichThereWasAMinimumOfSales = service.minSales(sales); // Номер месяца в котором был минимум продаж
        int NumberOfMonthsInWhichSalesWereBelowAverage = service.belowAverageSum(sales); // Кол-во месяцев, в которых продажи были ниже среднего
        int NumberOfMonthsInWhichSalesWereAboveAverage = service.aboveAverageSum(sales); // Кол-во месяцев, в которых продажи были выше среднего

        System.out.println("Сумма всех продаж: " + totalOfAllSales);
        System.out.println("Средняя сумма продаж в месяц: " + averageAmountOfSalesPerMonth);
        System.out.println("Номер месяца в котором был пик продаж: " + theNumberOfTheMonthInWhichTheSalesPeakWas);
        System.out.println("Номер месяца в котором был минимум продаж: " + theNumberOfTheMonthInWhichThereWasAMinimumOfSales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + NumberOfMonthsInWhichSalesWereBelowAverage);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + NumberOfMonthsInWhichSalesWereAboveAverage);
    }
}
