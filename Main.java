public class Main {
    public static void main(String[] args) {
        int ticketSellKop = 12500_50;

        if (ticketSellKop < 0) {
            ticketSellKop = 0;
        }

        int milesNumber = ticketSellKop / 20 / 100;
        System.out.println(milesNumber);
    }
}
