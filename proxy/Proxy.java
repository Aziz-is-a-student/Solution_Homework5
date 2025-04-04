package proxy;

public class Proxy {
    private LowResImage lowResImage;
    private HIghtResImage hightResImage;

    public Proxy(LowResImage lowResImage, HIghtResImage hightResImage) {
        this.lowResImage = lowResImage;
        this.hightResImage = hightResImage;
    }

    public void displayLowResImage() {
        lowResImage.display();
    }

    public void displayHightResImage() {
        if (hightResImage != null) {
            this.hightResImage = hightResImage;
        }
        hightResImage.display();
    }

}
