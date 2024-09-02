//       MC322 lab01 - 02/09/2024
//---------------------------------------
// José Henrique Lima Dias - RA: 237020
// Túlio Queiroz de Paula  - RA: 248710
//---------------------------------------

public class Passenger extends Person{

    private String name;
    private String destination;
    
    @Override
    public void performRole() throws InterruptedException {
        hailTaxi();
        getDestination();
        getName();
        askPrice();
        payment(0, 0);
    }
    
    public Passenger(String name, String dest) {
        this.destination = dest;
        this.name = name;
    }

    public boolean hailTaxi() throws InterruptedException {
        System.out.printf("\n%s: Hey Taxi!\n", this.name);
        Thread.sleep(888);
        return true;
    }

    public String getDestination() throws InterruptedException {
        System.out.printf("\nPassenger: Please, take me to %s\n", this.destination);
        Thread.sleep(888);
        return this.destination;
    }

    public String getName() {
        return this.name;
    }

    public static void askPrice() throws InterruptedException {
        System.out.println("\nPassenger: How much do I owe you?");
        Thread.sleep(888);
    }

    public static int payment(int price, int payment) throws InterruptedException{
        if (price > 50) {
            System.out.println("\nPassenger: (thinking) ~ Jeeezz! Very expensive! ~");
            Thread.sleep(888);
        }


        if (payment > price) {
            System.out.println("\nPassenger: Keep the change. Thank you!");
            Thread.sleep(888);
        }

        System.out.println("\nPassenger: Thanks, bye!");
        Thread.sleep(888);

        return payment;
    }
}
