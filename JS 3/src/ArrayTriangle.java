public class ArrayTriangle {
    public static void main (String[] args) {
        Triangle[] arrayTriangles = new Triangle[4];

        arrayTriangles[0] = new Triangle(10, 4);
        arrayTriangles[1] = new Triangle(20, 10);
        arrayTriangles[2] = new Triangle(15, 6);
        arrayTriangles[3] = new Triangle(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Area - " + i + " : " + arrayTriangles[i].countArea() + ", Perimeter: " + arrayTriangles[i].countPerimeter());
        }
    }
}
