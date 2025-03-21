import java.util.Scanner;

public class FriendPairing {

    public static int patyPairing(int n) {
    
        if ( n == 1) return 1;
        if ( n == 2) return 2;

        return patyPairing(n - 1) + (n - 1) * patyPairing(n - 2);
    }

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of people invited to party : ");
    int n = sc.nextInt();

    System.out.println("Total ways to invite " + n +  " people: " + patyPairing(n));

    }
}