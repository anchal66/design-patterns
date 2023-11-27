package structural.proxy;

public class ProxyImage implements Image{
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        //Extended functionlities
        System.out.println("Reduce Image Size");
        if (realImage == null)
            realImage = new RealImage(filename);
        realImage.display();
        //Other Functionlities
        System.out.println("Store image in DB");
    }
}
