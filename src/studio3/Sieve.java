import java.util.Scanner;

public class Sieve {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter an upperbound n between 1-100: ");
int n = scan.nextInt();

boolean[] isPrime = new boolean [n];
    for (int p = 2; p <= n; p++) {
    if (isPrime[p] == true)
        System.out.println("It's prime!");
    }
    for (int s = 2; s*s <= n; s++) {
        
    }


 



}





}

