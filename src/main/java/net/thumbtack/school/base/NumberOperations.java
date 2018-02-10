package net.thumbtack.school.base;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberOperations {
    /* 1 */
    public static Integer find(int[] array, int value) {
        Integer pos = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                pos = i;
            }
        }
        return pos;
    }

    /* 2 */
    public static Integer find(double[] array, double value, double eps) {
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - value) <= eps) {
                return i;
            }
        }
        return null;
    }

    /* 3 */
    public static Double calculateDensity(double weight, double volume, double min, double max) {
        double den = weight / volume;
        if (den >= min && den <= max) {
            return den;
        }
        return null;
    }

    /* 4 */
    public static Integer find(BigInteger[] array, BigInteger value) {
        Integer pos = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                pos = i;
            }
        }
        return pos;
    }

    /* 5 */
    public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max) {
        BigDecimal den = weight.divide(volume);
        if (den.compareTo(min) >= 0 && den.compareTo(max) <= 0) {
            return den;
        }
        return null;
    }
}
