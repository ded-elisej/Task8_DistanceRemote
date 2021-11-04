import java.util.Scanner;

public class DistanceRemoteOfChannel {
    public static void main (String [] args) {
        String[] chanels = {"Exit", "Belarus 1", "ONT", "STV", "Mir", "NTV"};
        System.out.print("Please, enter number 1 to 5 for choose channel or number 0 for exit: ");
        int numberOfChannel = new Scanner(System.in).nextInt();
        switch (numberOfChannel){
            case 1:
                System.out.println(chanels[1]);
                System.out.printf("Thanks for watching our channel %s!" , chanels[1]);
                break;
            case 2:
                System.out.println(chanels[2]);
                System.out.printf("Thanks for watching our channel %s!" , chanels[2]);
                break;
            case 3:
                System.out.println(chanels[3]);
                System.out.printf("Thanks for watching our channel %s!" , chanels[3]);
                break;
            case 4:
                System.out.println(chanels[4]);
                System.out.printf("Thanks for watching our channel %s!" , chanels[4]);
                break;
            case 5:
                System.out.println(chanels[5]);
                System.out.printf("Thanks for watching our channel %s!" , chanels[5]);
                break;
            case 0:
                System.out.println(chanels[0]);
                break;
            default :
                System.out.println("Incorrect input");
                break;
        }
    }
}
