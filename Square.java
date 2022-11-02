public class Square implements Shape{
    @Override
    public double getArea(double base, double altura) {
        double result = base * altura;
        return result;
    }

    @Override
    public double getPerimeter(double x) {
        double result = 4 * x;
        return result;
    }
}
