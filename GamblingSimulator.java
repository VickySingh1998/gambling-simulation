public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        System.out.println("     ");
        int stake = 100;
        int bet = 1;
        int totalAmount=0;

        while (stake > 50 && stake < 150) {
            int bettingAmount = (int) Math.floor(Math.random() * 10) % 2;

            if (bet == bettingAmount) {
                System.out.println("It's a win");
                totalAmount = stake + bet;
            } else {
                System.out.println("So sorry you lose");
                totalAmount = stake - bet;
            }
            System.out.println("New Stake Amount: " + totalAmount);
            stake = totalAmount;
        }
        System.out.println(" ");
        System.out.println("Your Total Amount Now: " + stake);

        if (stake == 50 || stake == 150) {
            System.out.println(" ");
            System.out.println("Player would like to resign for the today");
        }
    }
}