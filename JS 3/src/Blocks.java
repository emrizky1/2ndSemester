public class Blocks {
    public int width, length, height;

    public Blocks(int p, int l, int h) {
        length = p;
        width = l;
        height = h;
    }

    public int countVolume(){
        return length*width*height;
    }
}

