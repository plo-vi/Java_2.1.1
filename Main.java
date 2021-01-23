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

// version 2 of realisation the task
//
// public class Main {
//     public static void main(String[] args) {
//         int ticketSellKop = 12500_50;
// 
//         if (ticketSellKop < 0) {
//             ticketSellKop = 0;
//         }
//
//         int milesNumber = ticketSellKop / 20 / 100;
// 
//         System.out.println(milesNumber);
//     }
// }
