public class Blocks20 {
    public int width, length, height;

    public Blocks20(int p, int l, int h) {
        length = p;
        width = l;
        height = h;
    }

    public int countVolume(){
        return length*width*height;
    }
}

