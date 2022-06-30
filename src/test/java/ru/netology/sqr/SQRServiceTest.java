package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest //Проверяет входящие значения
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void testLimited(int expected, int firstNumber, int lastNumber) {
        SQRService service = new SQRService();

        int actual = service.serviceCalculate(firstNumber, lastNumber);
        Assertions.assertEquals(expected, actual);
    }
}
