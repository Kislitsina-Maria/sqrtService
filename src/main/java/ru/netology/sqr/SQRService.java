package ru.netology.sqr;

public class SQRService {

    public int serviceCalculate(int firstNumber, int lastNumber) {
        int sumSqr = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstNumber) {
                if (i * i <= lastNumber) {
                    sumSqr = sumSqr + 1;
                }
            }
        }
        return sumSqr;
    }
}
