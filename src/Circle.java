public class Circle extends Shape{
private static final double PI=3.14;
private int r;
    @Override
    public void calculateArea() {
        System.out.println(PI*(r*r));

    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void calculatePerimetr() {
        System.out.println(PI*2*r);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
