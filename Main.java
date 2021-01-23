public class Main {
    public static void main(String[] args) {
        double ticketSellKop = 125_000_000.50;

        if (ticketSellKop < 0) {
            ticketSellKop = 0;
        }

        double milesNumber = ticketSellKop / 20;

        System.out.printf("%.2f", milesNumber);
    }
}
