public class ArrayBlocks20 {
    public static void main(String[] args) {
        Blocks20[] blArray = new Blocks20[3];

        blArray[0] = new Blocks20(100, 30, 12);
        blArray[1] = new Blocks20(120, 40, 15);
        blArray[2] = new Blocks20(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume blocks - " + i + " : " + blArray[i].countVolume());
        }
    }
}
