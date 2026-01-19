public class Utvecklare extends Anställd {
    private String programmeringsSpråk;
    private int antalRaderKod;

    public Utvecklare(String namn, int månadslön, String programmeringsSpråk) {
        super(namn, månadslön);
        this.programmeringsSpråk = programmeringsSpråk;
        this.antalRaderKod = 0;
    }

    public String getProgrammeringsSpråk() {
        return programmeringsSpråk;
    }

    public void setProgrammeringsSpråk() {
        programmeringsSpråk = this.programmeringsSpråk;
    }

    public void arbeta() {
        antalRaderKod += 300;
        System.out.println(namn + " skriver kod i " + programmeringsSpråk);
    }
}