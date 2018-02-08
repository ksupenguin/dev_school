package net.thumbtack.school.figures.v1;

public class CircleFactory {
    private static int count;

    /* 1 */
    public static Circle createCircle(Point2D center, int radius) {
        count++;
        return new Circle(center, radius);
    }

    /* 2 */
    public static int getCircleCount() {
        return count;
    }

    /* 3 */
    public static void reset() {
        count = 0;
    }
}
