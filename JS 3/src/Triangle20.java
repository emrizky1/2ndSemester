public class Triangle20 {
    public int base;
    public int height;

    public Triangle20(int a, int t) {
        base = a;
        height = t;
    }

    public double countArea() {
        return 0.5*base*height;
    }

    public int countPerimeter() {
        return base+height;
    }
}
