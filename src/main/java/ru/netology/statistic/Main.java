package ru.netology.statistic;

public class Main{
    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 5, -8, 4, 5, -3, 8, 6, 11, 11, 24};
        long result = service.findMax(incomes);
        System.out.println(result);
    }

}
