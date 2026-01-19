public class Säljare extends Anställd {
    private int antalSåldaEnheter;

    public Säljare(String namn, int månadslön) {
        super(namn, månadslön);
        this.antalSåldaEnheter = 0;
    }

    public void arbete() {
        System.out.println(namn + " har sålt " + antalSåldaEnheter + " enheter");
        antalSåldaEnheter += 10;
    }
}