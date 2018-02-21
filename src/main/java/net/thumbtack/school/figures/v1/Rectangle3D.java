package net.thumbtack.school.figures.v1;

public class Rectangle3D extends Rectangle {
    private int height;

    /* 1 */
    public Rectangle3D(Point2D leftTop, Point2D rightBottom, int height) {
        super(leftTop, rightBottom);
        setHeight(height);
    }

    /* 2 */
    public Rectangle3D(int xLeft, int yTop, int xRight, int yBottom, int height) {
        super(xLeft, yTop, xRight, yBottom);
        setHeight(height);
    }

    /* 3 */
    public Rectangle3D(int length, int width, int height) {
        super(length, width);
        setHeight(height);
    }

    /* 4 */
    public Rectangle3D() {
        super();
        setHeight(1);
    }

    /* 7 */
    public int getHeight() {
        return height;
    }

    /* 10 */
    public void setHeight(int height) {
        this.height = height;
    }

    /* 17 */
    public double getVolume() {
        return getArea() * height;
    }

    /* 20 */
    public boolean isInside(int x, int y, int z) {
        return isInside(x, y) && z <= height;
    }

    /* 21 */
    public boolean isInside(Point3D point) {
        return isInside(point.getX(), point.getY(), point.getZ());
    }

    /* 22 */
    public boolean isIntersects(Rectangle3D rectangle) {
        return isIntersects(new Rectangle(rectangle.getTopLeft(), rectangle.getBottomRight()));
    }

    /* 23 */
    public boolean isInside(Rectangle3D rectangle) {
        return isInside(new Rectangle(rectangle.getTopLeft(), rectangle.getBottomRight())) && rectangle.getHeight() <= height;
    }

    /* 24*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle3D that = (Rectangle3D) o;

        return height == that.height;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + height;
        return result;
    }
}
