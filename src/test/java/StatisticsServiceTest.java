

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import ru.netology.statistic.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, -8, 4, 5, -3, 8, 6, 11, 11, 24};
        long expected = 24;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax3() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 0, 0, 4, 5, 100, 8, 6, 11, 11, 24};
        long expected = 100;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}