package proxy;

/**
 * Прокси для объекта RealImage
 * @author alkl1m
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Проверяет загружено ли реальное изображение
     * в противном случае создает новый экземпляр RealImage
     * и делегирует ему вызов display
     */
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    public RealImage getRealImage() {
        return realImage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setRealImage(RealImage realImage) {
        this.realImage = realImage;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
