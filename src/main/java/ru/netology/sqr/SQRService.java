package ru.netology.sqr;

public class SQRService {

    public int ServiceCalculate (int x, int y) {
        int sumSqr = 0;
        for (int i = 10; i <= 99; i ++ ) {
            if (i * i >= x ) {
                if (i * i <= y) {
                    sumSqr = sumSqr + 1;
                }
            }
        }
        return sumSqr;
    }



}