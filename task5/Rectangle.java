
public class Rectangle {

    public int lenght;
    public int breadth;

    public int area() {
        int a = lenght * breadth;
        return a;
    }

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        Rectangle rec2 = new Rectangle();

        rec.lenght = 10;
        rec.breadth = 20;
        rec2.lenght = 5;
        rec2.breadth = 2;

        int area = rec.area();
        int area2 = rec2.area();

        System.out.println(area);
        System.out.println(rec);
        System.out.println(area2);
        System.out.println(rec2);

    }

}