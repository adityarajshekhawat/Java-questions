package Q3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n%2 != 0){
            System.out.println("weird");
        }
        else if (n%2 == 0 && n>2 && n<5 )
            System.out.println("not weird");

        else if (n%2 == 0 && n>6 && n<=20 )
            System.out.println("weird");

        else if (n%2 == 0 && n>20 )
            System.out.println("not weird");
        
        scan.close();
    }
}
