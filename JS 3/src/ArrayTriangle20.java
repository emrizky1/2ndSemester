public class ArrayTriangle20 {
    public static void main (String[] args) {
        Triangle20[] arrayTriangles = new Triangle20[4];

        arrayTriangles[0] = new Triangle20(10, 4);
        arrayTriangles[1] = new Triangle20(20, 10);
        arrayTriangles[2] = new Triangle20(15, 6);
        arrayTriangles[3] = new Triangle20(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Area - " + i + " : " + arrayTriangles[i].countArea() + ", Perimeter: " + arrayTriangles[i].countPerimeter());
        }
    }
}
