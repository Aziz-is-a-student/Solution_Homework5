package proxy;

public class Main {
    public static void main(String[] args) {
        LowResImage lowResImage = new LowResImage("pic1","C/descktop/pictures/pic1.jpg");
        HIghtResImage hIghtResImage = new HIghtResImage("pic2","C/descktop/pictures/pic2.jpg");
        Proxy imageProxy = new Proxy(lowResImage,hIghtResImage);


        imageProxy.displayLowResImage();

        imageProxy.displayHightResImage();
    }
}
