//       MC322 lab01 - 02/09/2024
//---------------------------------------
// José Henrique Lima Dias - RA: 237020
// Túlio Queiroz de Paula  - RA: 248710
//---------------------------------------

import java.util.Random;

public class Cabbie extends Person {
    private int money;

    @Override
    public void performRole() throws InterruptedException {
        charge();
        greetings();
        setMoney(money);
    }

    public Cabbie(){
        this.money = 0;
    }
    
    public static void greetings() throws InterruptedException {
        System.out.println("\nCabbie: Hello!");
        Thread.sleep(888);
    }

    public void setMoney(int money) throws InterruptedException {
        this.money = money;
        System.out.println("\nCabbie: Thank you! Have a nice day!");
        Thread.sleep(888);
    }

    public static int charge() throws InterruptedException {
        Random random = new Random();
        int price = random.nextInt(100);
        System.out.printf("\nCabbie: $%d\n", price);
        Thread.sleep(888);
        return price;
    }
}
