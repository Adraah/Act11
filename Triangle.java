public class Triangle implements Shape{
    @Override
    public double getArea(double base, double altura) {
        double result = (base * altura)/2;
        return result;
    }

    @Override
    public double getPerimeter(double x) {
        double result = 3 * x;
        return result;
    }
}
