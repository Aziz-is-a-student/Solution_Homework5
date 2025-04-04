package proxy;

public class Main {
    public static void main(String[] args) {
        Proxy imageProxy = new Proxy("pic1","C:/lowResPics/pic1.jpg","C:/HigResPics/pic1.jpg");


        imageProxy.displayLowResImage();

        imageProxy.displayHightResImage();
    }
}
