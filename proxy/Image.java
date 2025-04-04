package proxy;

public class Image {
    private String filename;
    private String path;

    public Image(String filename, String path) {
        this.filename = filename;
        this.path = path;
    }
    public  void display() {
        System.out.println(path);
        System.out.println(filename);
    }
}
