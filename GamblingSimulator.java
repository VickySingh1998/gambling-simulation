public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        System.out.println("     ");
        int stake=100;
        int bet=1;
        int totalAmount;
        int bettingAmount= (int) Math.floor(Math.random()*10) % 2;
        
        if (bet == bettingAmount) {
            System.out.println("It's a win");
            totalAmount = stake + bet;
        }
        else{
            System.out.println("So sorry you lose");
            totalAmount = stake - bet;
        }
        System.out.println("Your Total Amount Now: " +totalAmount);
    }
}