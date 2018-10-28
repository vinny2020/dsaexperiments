package com.xaymaca.algorithms;

public class EuclidGreatestCommonDenominator {


    private static int greatestCommonDenominator(int p, int q) {

        if (q == 0) return p;
        int remainder = p % q;
        return greatestCommonDenominator(q, remainder);

    }

    public static void main(String[] args) {
        float dividend = 1500;
        float divisor = 75004;
        int p = 1500;
        int q = 75004;


        System.out.println(greatestCommonDenominator(p, q));
        System.out.println("quotient: " + dividend / divisor);

    }
}
