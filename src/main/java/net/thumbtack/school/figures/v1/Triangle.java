package net.thumbtack.school.figures.v1;

public class Triangle {
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;

    /* 1 */
    public Triangle(Point2D point1, Point2D point2, Point2D point3) {
        setPoint1(point1);
        setPoint2(point2);
        setPoint3(point3);
    }

    /* 2 */
    public Point2D getPoint1() {
        return point1;
    }

    /* 5 */
    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    /* 3 */
    public Point2D getPoint2() {
        return point2;
    }

    /* 6 */
    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    /* 4 */
    public Point2D getPoint3() {
        return point3;
    }

    /* 7 */
    public void setPoint3(Point2D point3) {
        this.point3 = point3;
    }

    public double getSide(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    /* 8 */
    public double getSide12() {
        return getSide(point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }

    /* 9 */
    public double getSide13() {
        return getSide(point1.getX(), point1.getY(), point3.getX(), point3.getY());
    }

    /* 10 */
    public double getSide23() {
        return getSide(point2.getX(), point2.getY(), point3.getX(), point3.getY());
    }

    /* 11 */
    public void moveRel(int dx, int dy) {
        setPoint1(new Point2D(point1.getX() + dx, point1.getY() + dy));
        setPoint2(new Point2D(point2.getX() + dx, point2.getY() + dy));
        setPoint3(new Point2D(point3.getX() + dx, point3.getY() + dy));
    }

    public double calcArea(Point2D point11, Point2D point22, Point2D point33) {
        double side1 = getSide(point11.getX(), point11.getY(), point22.getX(), point22.getY());
        double side2 = getSide(point33.getX(), point33.getY(), point22.getX(), point22.getY());
        double side3 = getSide(point11.getX(), point11.getY(), point33.getX(), point33.getY());
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    /* 12 */
    public double getArea() {
        return calcArea(point1, point2, point3);
    }

    /* 13 */
    public double getPerimeter() {
        return getSide12() + getSide23() + getSide13();
    }

    /* 14 */
    public boolean isInside(int x, int y) {
        return isInside(new Point2D(x, y));
    }

    /* 15 */
    public boolean isInside(Point2D point) {
        double area1 = calcArea(point1, point2, point);
        double area2 = calcArea(point2, point3, point);
        double area3 = calcArea(point1, point3, point);
        double areaSum = area1 + area2 + area3;
        return areaSum <= calcArea(point1, point2, point3);
    }

    /* 16 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!point1.equals(triangle.point1)) return false;
        return point2.equals(triangle.point2) && point3.equals(triangle.point3);
    }

    @Override
    public int hashCode() {
        int result = point1.hashCode();
        result = 31 * result + point2.hashCode();
        result = 31 * result + point3.hashCode();
        return result;
    }
}
