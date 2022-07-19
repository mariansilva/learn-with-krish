package memento;

public class LedTV {
    private String sizes;
    private int price;
    private boolean usbSupport;

    public LedTV(String sizes, int price, boolean usbSupport) {
        super();
        this.sizes = sizes;
        this.price = price;
        this.usbSupport = usbSupport;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isUsbSupport() {
        return usbSupport;
    }

    public void setUsbSupport(boolean usbSupport) {
        this.usbSupport = usbSupport;
    }



}
