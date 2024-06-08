package proxy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ImageTest {

    @Test
    public void testProxyDisplay_withCreatingNewRealImage_returnsSameRealImage() {
        ProxyImage proxyImage = new ProxyImage("test.jpg");
        proxyImage.display();
        RealImage realImage = proxyImage.getRealImage();

        assertNotNull(realImage);
        assertEquals("test.jpg", realImage.getFilename());
    }

    @Test
    public void testProxyDisplay_withoutCreatingNewRealImage_returnsNewRealImage() {
        ProxyImage proxyImage = new ProxyImage("test.jpg");
        RealImage realImage = new RealImage("test.jpg");
        proxyImage.setRealImage(realImage);

        proxyImage.display();
        RealImage updatedRealImage = proxyImage.getRealImage();

        assertNotNull(updatedRealImage);
        assertEquals("test.jpg", updatedRealImage.getFilename());
    }

    @Test
    public void testProxyDisplay_withRealImage_runDisplayFromRealImage() {
        RealImage realImageMock = Mockito.mock(RealImage.class);
        ProxyImage proxyImage = new ProxyImage("test.jpg");
        proxyImage.setRealImage(realImageMock);

        proxyImage.display();
        proxyImage.display();

        Mockito.verify(realImageMock, Mockito.times(2)).display();
    }
}