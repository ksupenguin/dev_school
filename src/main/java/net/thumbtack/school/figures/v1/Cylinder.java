package net.thumbtack.school.figures.v1;

public class Cylinder extends Circle {
    private int height;

    /* 1 */
    public Cylinder(Point2D center, int radius, int height) {
        super(center, radius);
        setHeight(height);
    }

    /* 2 */
    public Cylinder(int xCenter, int yCenter, int radius, int height) {
        super(xCenter, yCenter, radius);
        setHeight(height);
    }

    /* 3 */
    public Cylinder(int radius, int height) {
        super(radius);
        setHeight(height);
    }

    /* 4 */
    public Cylinder() {
        super();
        setHeight(1);
    }

    /* 9 */
    public int getHeight() {
        return height;
    }

    /* 10 */
    public void setHeight(int height) {
        this.height = height;
    }

    /* 15 */
    public double getVolume() {
        return getArea() * height;
    }

    /* 16 */
    public boolean isInside(int x, int y, int z) {
        return isInside(x, y) && z <= height;
    }

    /* 17 */
    public boolean isInside(Point3D point) {
        return isInside(new Point2D(point.getX(), point.getY())) && point.getZ() <= height;
    }

    /* 18 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cylinder cylinder = (Cylinder) o;

        return height == cylinder.height;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + height;
        return result;
    }
}
