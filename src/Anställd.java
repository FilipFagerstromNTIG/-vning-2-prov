public class Anställd {
    protected String namn;
    protected int månadslön;

    public Anställd(String namn, int månadslön) {
        this.namn = namn;
        this.månadslön = månadslön;
    }

    public int getMånadslön() {
        return månadslön;
    }

    public void setMånadslön(int månadslön) {
        this.månadslön = månadslön;
    }

    public void arbeta() {
        System.out.println(namn + " gör saker");
    }
}
