package proxy;

public class HIghtResImage extends Image implements Displayable{
    public HIghtResImage(String filename, String path) {
        super(filename, path);
    }
    @Override
    public void display() {
        System.out.println("Display Hight Res Image");
        System.out.println(getPath());
        System.out.println(getFilename());
    }
}
