//       MC322 lab01 - 02/09/2024
//---------------------------------------
// José Henrique Lima Dias - RA: 237020
// Túlio Queiroz de Paula  - RA: 248710
//---------------------------------------

public class Taxi {

    private String destination;
    private boolean isHailed;

    public Taxi() {
        this.destination = "";
        this.isHailed = false;
    }

    public void setHail(boolean isHailed) {
        this.isHailed = isHailed;
        VrumBeepBeep();
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void VrumBeepBeep() {
        if (this.isHailed);
            System.out.println("\nVruuumm... Beep Beep!");
    }

    
    public static void ride() throws InterruptedException {
        System.out.println("\nVruuumm...");
        Thread.sleep(888);
        System.out.println("\n... ... ...");
        Thread.sleep(888);
        System.out.println("\n... ... ...");
    }
}
