package proxy;

public class Proxy {
    private String filename;
    private String lowResPath;
    private String highResPath;
    private Image lowResImage;
    private Image highResImage;

    public Proxy(String filename, String lowResPath, String highResPath) {
        this.filename = filename;
        this.lowResPath = lowResPath;
        this.highResPath = highResPath;
        this.lowResImage = new LowResImage(filename, lowResPath);

    }

    public void displayLowResImage() {
        lowResImage.display();
    }

    public void displayHightResImage() {
        if (highResImage == null) {
            this.highResImage = new HIghtResImage(filename, highResPath);
        }
        highResImage.display();
    }

}
