import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        Scanner scan = new Scanner(System.in);

        System.out.println("1 area");
        System.out.println("2 perimetro");
        int num = scan.nextInt();

        if (num == 1){
            System.out.println("1 circulo");
            System.out.println("2 triangulo");
            System.out.println("3 cuadrado");
            num = scan.nextInt();
            switch(num){
                case 1:
                    System.out.println("radio:");
                    double r = scan.nextDouble();
                    System.out.println("pi:");
                    double pi = scan.nextDouble();
                    System.out.println("El area es: "+ circle.getArea(r,pi));
                    break;
                case 2:
                    System.out.println("base:");
                    double b = scan.nextDouble();
                    System.out.println("altura:");
                    double a = scan.nextDouble();
                    System.out.println("El area es: "+ triangle.getArea(b,a));
                    break;
                case 3:
                    System.out.println("base:");
                    double bs = scan.nextDouble();
                    System.out.println("altura:");
                    double h = scan.nextDouble();
                    System.out.println("El area es: "+ square.getArea(bs,h));
                    break;
            }
        } else{
            System.out.println("1 circulo");
            System.out.println("2 triangulo");
            System.out.println("3 cuadrado");
            num = scan.nextInt();
            switch(num){
                case 1:
                    System.out.println("radio:");
                    double r = scan.nextDouble();
                    System.out.println("El perimetro es: "+ circle.getPerimeter(r));
                    break;
                case 2:
                    System.out.println("lado:");
                    double l = scan.nextDouble();
                    System.out.println("El perimetro es: "+ triangle.getPerimeter(l));
                    break;
                case 3:
                    System.out.println("lado:");
                    double x = scan.nextDouble();
                    System.out.println("El perimetro es: "+ square.getPerimeter(x));
                    break;
            }
        }
    }
}