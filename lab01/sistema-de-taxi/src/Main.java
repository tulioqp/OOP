//       MC322 lab01 - 02/09/2024
//---------------------------------------
// José Henrique Lima Dias - RA: 237020
// Túlio Queiroz de Paula  - RA: 248710
//---------------------------------------

import java.util.Scanner;


public class Main {
    public static void main (String[] args) throws InterruptedException {

        int play = 1;
        while (play > 0 ) {

            Scanner scan = new Scanner(System.in);

            System.out.println("\nEnter the passenger's name:");
            String name = scan.nextLine();

            System.out.println("\nEnter the destination");
            String dest = scan.nextLine();

            Taxi myTaxi = new Taxi();
            Cabbie myCabbie = new Cabbie();
            Passenger myPassenger = new Passenger(name, dest);
                    
            boolean hail = myPassenger.hailTaxi();
            myTaxi.setHail(hail);

            Cabbie.greetings();

            String destination = myPassenger.getDestination();  
            myTaxi.setDestination(destination);   
    
            Taxi.ride();

            Passenger.askPrice();

            int price = Cabbie.charge();

            int payment = 0;
            while (payment < price) {
                System.out.println("\nEnter the payment value (an integer value)");
                payment = scan.nextInt();
            }
            
            myCabbie.setMoney(Passenger.payment(price, payment));

            System.out.println("\nRestart: Enter 1\nStop: Enter 0");
            play = scan.nextInt();
            
            if (play == 0) {
                System.out.println("\nThat's all folks :)");
                scan.close();
            }
        }
    }
}