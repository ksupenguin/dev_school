package net.thumbtack.school.figures.v1;

public class Circle {
    private int radius;
    private Point2D center;

    /* 1 */
    public Circle(Point2D center, int raduis) {
        setRadius(raduis);
        setCenter(center);
    }

    /* 2 */
    public Circle(int xCenter, int yCenter, int radius) {
        setRadius(radius);
        setCenter(new Point2D(xCenter, yCenter));
    }

    /* 3 */
    public Circle(int radius) {
        setRadius(radius);
        setCenter(new Point2D(0, 0));
    }

    /* 4 */
    public Circle() {
        this(0, 0, 1);
    }

    /* 6 */
    public int getRadius() {
        return radius;
    }

    /* 8 */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /* 5 */
    public Point2D getCenter() {
        return center;
    }

    /* 7 */
    public void setCenter(Point2D center) {
        this.center = center;
    }

    /* 9 */
    public void moveRel(int dx, int dy) {
        setCenter(new Point2D(center.getX() + dx, center.getY() + dy));
    }

    /* 10 */
    public void enlarge(int n) {
        setRadius(radius * n);
    }

    /* 11 */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /* 12 */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /* 13 */
    public boolean isInside(int x, int y) {
        return Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2)) <= radius;
    }

    /* 14 */
    public boolean isInside(Point2D point) {
        return isInside(point.getX(), point.getY());
    }

    /* 15 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return radius == circle.radius && center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        int result = radius;
        result = 31 * result + center.hashCode();
        return result;
    }
}
