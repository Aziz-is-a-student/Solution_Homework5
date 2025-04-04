package proxy;

public class LowResImage extends Image implements Displayable {
    public LowResImage(String filename, String path) {
        super(filename, path);
    }

    @Override
    public void display() {
        System.out.println("Display Low Res Image");
        System.out.println(getPath());
        System.out.println(getFilename());
    }
}
