//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("--- Personalregistret startar ---");

        // 1. Skapa en array av basklass-typen Anställd (Polymorfism)
        Anställd[] personal = new Anställd[2];

        personal[0] = new Utvecklare("Alice", 35000, "Java");
        personal[1] = new Säljare("Bob", 30000);

        System.out.println("\n--- Dagens arbetsuppgifter ---");

        // 3. Loopa genom listan och anropa polymorfa metoder
        for (Anställd anställd : personal) {

            // utförArbete() är polymorf: Den anropar Utvecklarens eller Säljarens unika
            // version
            anställd.arbeta();
            // getMånadslön() är ärvd och fungerar för alla
            System.out.println(anställd.namn + " (Lön: " + anställd.getMånadslön() + " kr)");
            System.out.println("----------------------------------------");
        }
    }
}