package proxy;

public abstract class Image implements Displayable {
    private String filename;
    private String path;

    public Image(String filename, String path) {
        this.filename = filename;
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public String getPath() {
        return path;
    }
    @Override
   public abstract void  display();
}
