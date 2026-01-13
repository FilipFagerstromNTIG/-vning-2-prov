public class Säljare extends Anställd {
    private int antalSåldaEnheter;

    public Säljare(String namn, int måndaslön) {
        super(namn, månadslön);
        this.antalSåldaEnheter = 0;
    }
}
