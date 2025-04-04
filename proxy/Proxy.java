package proxy;

public class Proxy {
    private String filename;
    private String path;
    private Image lowResImage;
    private Image hightResImage;

    public Proxy(String filename, String path) {
        this.filename = filename;
        this.path = path;
        this.lowResImage = new LowResImage(filename, path);
    }

    public void displayLowResImage() {
        lowResImage.d;
    }

    public void displayHightResImage() {
        if (hightResImage != null) {
            this.hightResImage = hightResImage;
        }
        hightResImage.display();
    }

}
