package memento;

public class Memento {
    public Memento(LedTV ledTV) {
        super();
        this.ledTV = ledTV;
    }

    private LedTV ledTV;

    public LedTV getLedTV() {
        return ledTV;
    }

    public void setLedTV(LedTV ledTV) {
        this.ledTV = ledTV;
    }


    @Override
    public String toString() {
        return "Memento{" +
                "ledTV=" + ledTV +
                '}';
    }
}
