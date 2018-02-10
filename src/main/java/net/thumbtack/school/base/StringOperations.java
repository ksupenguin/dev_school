package net.thumbtack.school.base;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringOperations {

    /* 1 */
    public static int getSummaryLength(String[] strings) {
        return Arrays.stream(strings).mapToInt(String::length).sum();
    }

    /* 2 */
    public static String getFirstAndLastLetterString(String string) {
        return "" + string.charAt(0) + string.charAt(string.length() - 1);
    }

    /* 3 */
    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        return string1.charAt(index) == string2.charAt(index);
    }

    /* 4 */
    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        return string1.indexOf(character) == string2.indexOf(character);
    }

    /* 5 */
    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        return string1.lastIndexOf(character) == string2.lastIndexOf(character);
    }

    /* 6 */
    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        return string1.indexOf(str) == string2.indexOf(str);
    }

    /* 7 */
    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        return string1.lastIndexOf(str) == string2.lastIndexOf(str);
    }

    /* 8 */
    public static boolean isEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    /* 9 */
    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    /* 10 */
    public static boolean isLess(String string1, String string2) {
        return string1.compareTo(string2) < 0;
    }

    /* 11 */
    public static boolean isLessIgnoreCase(String string1, String string2) {
        return string1.compareToIgnoreCase(string2) < 0;
    }

    /* 12 */
    public static String concat(String string1, String string2) {
        return string1 + string2;
    }

    /* 13 */
    public static boolean isSamePrefix(String string1, String string2, String prefix) {
        return string1.startsWith(prefix) && string2.startsWith(prefix);
    }

    /* 14 */
    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        return string1.endsWith(suffix) && string2.endsWith(suffix);
    }

    /* 15 */
    public static String getCommonPrefix(String string1, String string2) {
        StringBuilder newString = new StringBuilder();
        int length = string1.length() < string2.length() ? string1.length() : string2.length();
        for (int i = 0; i < length; i++) {
            char c1 = string1.charAt(i);
            char c2 = string2.charAt(i);
            if (c1 == c2) {
                newString.append(c1);
            } else {
                return newString.toString();
            }
        }
        return newString.toString();
    }

    /* 16 */
    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /* 17 */
    public static boolean isPalindromeIgnoreCase(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (!String.valueOf(string.charAt(i)).equalsIgnoreCase(String.valueOf(string.charAt(string.length() - i - 1)))) {
                return false;
            }
        }
        return true;
    }

    /* 18 */
    public static String getLongestPalindromeIgnoreCase(String[] strings) {
        String newstr = "";
        for (String string : strings) {
            if (isPalindromeIgnoreCase(string)) {
                newstr = string.length() > newstr.length() ? string : newstr;
            }
        }
        return newstr;
    }

    /* 19 */
    public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
        int subLength = index + length;
        return subLength <= string1.length() &&
                subLength <= string2.length() &&
                string1.substring(index, subLength).equals(string2.substring(index, subLength));
    }

    /* 20 */
    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1,
                                                        String string2, char replaceInStr2, char replaceByInStr2) {
        return string1.replace(replaceInStr1, replaceByInStr1).equals(string2.replace(replaceInStr2, replaceByInStr2));
    }

    /* 21 */
    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1,
                                                     String string2, String replaceInStr2, String replaceByInStr2) {
        return string1.replace(replaceInStr1, replaceByInStr1).equals(string2.replace(replaceInStr2, replaceByInStr2));
    }

    /* 22 */
    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
        return isPalindromeIgnoreCase(string.replaceAll("\\s", ""));
    }

    /* 23 */
    public static boolean isEqualAfterTrimming(String string1, String string2) {
        return string1.trim().equals(string2.trim());
    }

    /* 24 */
    public static String makeCsvStringFromInts(int[] array) {
        return Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(","));
    }

    /* 25 */
    public static String makeCsvStringFromDoubles(double[] array) {
        return Arrays.stream(array).mapToObj(d -> String.format("%.2f", d)).collect(Collectors.joining(","));
    }

    /* 26 */
    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
        String[] strings = Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new);
        return new StringBuilder(String.join(",", strings));
    }

    /* 27 */
    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
        String[] strings = Arrays.stream(array).mapToObj(d -> String.format("%.2f", d)).toArray(String[]::new);
        return new StringBuilder(String.join(",", strings));
    }

    /* 28 */
    public static StringBuilder removeCharacters(String string, int[] positions) {
        StringBuilder sb = new StringBuilder(string);
        int count = 0;
        for (int i : positions) {
            sb.deleteCharAt(i + count--);
        }
        return sb;
    }

    /* 29 */
    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
        StringBuilder sb = new StringBuilder(string);
        int count = 0;
        for (int i = 0; i < positions.length; i++) {
            sb.insert(positions[i] + count++, characters[i]);
        }
        return sb;
    }
}



