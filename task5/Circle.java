public class Circle {

    public int radius;
    public double pi;

    public double area1() {
        double a = pi * radius * radius;
        return a;
    }

    public static void main(String[] agrs) {

        Circle cir = new Circle();
        cir.radius = 4;
        cir.pi = 3.14;
        double area = cir.area1();
        System.out.println(area);

    }
}