package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest //Проверяет входящие значения
//    @CsvSource({
//            "3,200,300", //Проверяет входящие значения
//            "0,9802,100000", //Проверяет верхние невходящие граничные значения
//            "2,9604,9801", //Проверяет верхние входящие граничные значения
//            "1,0,100", //Проверяет нижние входящие граничные значения
//            "0,-5,99" //Проверяет нижние невходящие граничные значения
//    })
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public  void testLimited(int expected, int x, int y) {
        SQRService service = new SQRService();

        int actual = service.ServiceCalculate(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
