package net.thumbtack.school.figures.v1;

public class Rectangle {
    private Point2D topLeft;
    private Point2D bottomRight;

    /* 1 */
    public Rectangle(Point2D topLeft, Point2D bottomRight) {
        setTopLeft(topLeft);
        setBottomRight(bottomRight);
    }

    /* 2 */
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        setTopLeft(new Point2D(xLeft, yTop));
        setBottomRight(new Point2D(xRight, yBottom));
    }

    /* 3 */
    public Rectangle(int length, int width) {
        setTopLeft(new Point2D(0, -width));
        setBottomRight(new Point2D(length, 0));
    }

    /* 4 */
    public Rectangle() {
        setTopLeft(new Point2D(0, -1));
        setBottomRight(new Point2D(1, 0));
    }

    /* 5 */
    public Point2D getTopLeft() {
        return topLeft;
    }

    /* 7 */
    public void setTopLeft(Point2D topLeft) {
        this.topLeft = topLeft;
    }

    /* 6 */
    public Point2D getBottomRight() {
        return bottomRight;
    }

    /* 8 */
    public void setBottomRight(Point2D bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    /* 9 */
    public int getLength() {
        return bottomRight.getX() - topLeft.getX();
    }

    /* 10 */
    public int getWidth() {
        return bottomRight.getY() - topLeft.getY();
    }

    /* 11 */
    public void moveRel(int dx, int dy) {
        setTopLeft(new Point2D(topLeft.getX() + dx, topLeft.getY() + dy));
        setBottomRight(new Point2D(bottomRight.getX() + dx, bottomRight.getY() + dy));
    }

    /* 12 */
    public void enlarge(int nx, int ny) {
        setBottomRight(new Point2D(getWidth() * nx + topLeft.getX(), getLength() * ny + topLeft.getY()));
    }

    /* 13 */
    public double getArea() {
        return getLength() * getWidth();
    }

    /* 14 */
    public double getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    /* 15 */
    public boolean isInside(int x, int y) {
        if (x >= topLeft.getX() && x <= bottomRight.getX()) {
            if (y >= topLeft.getY() && y <= bottomRight.getY()) {
                return true;
            }
        }
        return false;
    }

    /* 16 */
    public boolean isInside(Point2D point) {
        return isInside(point.getX(), point.getY());
    }

    /* 17 */
    public boolean isIntersects(Rectangle rectangle) {
        return !(rectangle.getTopLeft().getX() > bottomRight.getX() ||
                rectangle.getTopLeft().getY() > bottomRight.getY() ||
                rectangle.getBottomRight().getX() < topLeft.getX() ||
                rectangle.getBottomRight().getY() < topLeft.getY());
    }

    /* 18 */
    public boolean isInside(Rectangle rectangle) {
        return (rectangle.getTopLeft().getX() >= topLeft.getX() &&
                rectangle.getTopLeft().getY() >= topLeft.getY() &&
                rectangle.getBottomRight().getX() <= bottomRight.getX() &&
                rectangle.getBottomRight().getY() <= bottomRight.getY());
    }

    /* 19 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        return topLeft.equals(rectangle.topLeft) && bottomRight.equals(rectangle.bottomRight);
    }

    @Override
    public int hashCode() {
        int result = topLeft.hashCode();
        result = 31 * result + bottomRight.hashCode();
        return result;
    }
}
