public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        System.out.println("     ");
        int stake = 100;
        int bet = 1;
        int totalAmount=0;
        int days=0, win=0;

        while (days<20) {
            days++;
            while (stake > 50 && stake < 150) {
                int bettingAmount = (int) Math.floor(Math.random() * 10) % 2;

                if (bet == bettingAmount) {
                    //System.out.println("It's a win");
                    totalAmount = stake + bet;
                } else {
                    //System.out.println("So sorry you lose");
                    totalAmount = stake - bet;
                }
                //System.out.println("New Stake Amount: " + totalAmount);
                stake = totalAmount;
            }
            System.out.println("Day " + days);
            if (totalAmount==150){
                win +=stake;
            }
            else{
                win -=stake;
            }
            System.out.println(win);
        }
        System.out.println(" ");
        System.out.println("Total ammount ater 20 days = " +win);
        }
    }