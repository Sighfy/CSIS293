/*
Create a class named Circle with fields named radius, diameter, and area.
Include a constructor that sets the radius to 1 and calculates the other
two values. Also include methods named setRadius() and getRadius(). The
setRadius() method not only sets the radius, but it also calculates the
other two values. (The diameter of a circle is twice the radius, and the
area of a circle is pi multiplied by the square of the radius. Use the Math
class PI constant for this calculation.)
 */
class Circle
{
    private double radius;
    private double area;
    private double diameter;

    Circle()
    {
        radius = 1;
        computeDiameter();
        computeArea();
    }
    public void setRadius(double r)
    {
        radius = r;
        computeDiameter();
        computeArea();
    }
    public double getRadius()
    {
        return radius;
    }
    private void computeDiameter()
    {
        final int DIAMETER_FACTOR = 2;
        diameter = radius * DIAMETER_FACTOR;
    }
    private void computeArea()
    {
        area = (radius * radius) * Math.PI;
    }
    public double getDiameter()
    {
        return diameter;
    }
    public double getArea()
    {
        return area;
    }
}
