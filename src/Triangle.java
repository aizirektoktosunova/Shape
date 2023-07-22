public class Triangle extends Shape{
    private  int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateArea() {
        int p=(a+b+c)/2;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    @Override
    public void calculatePerimetr() {
        System.out.println("P"+(a+b+c)/2);
    }


}
