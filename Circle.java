public class Circle implements Shape{
    @Override
    public double getArea(double r, double pi) {
        double result = (r*r)*pi;
        return result;
    }

    @Override
    public double getPerimeter(double r) {
        double result = 2 * 3.14 * r;
        return result;
    }
}
